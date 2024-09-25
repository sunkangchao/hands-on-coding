package com.project.core.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * RedisConfig
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 24, 2024</pre>
 */
@Configuration
public class RedisConfig {


    /**
     * redis连接工厂bean就两种实现，一种是LettuceConnectionFactory，另一种是JedisConnectionFactory（默认）
     *
     * @return
     */
//    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {

//        RedisConfiguration
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
        configuration.setHostName("localhost");
        configuration.setPort(6379);

        // 配置连接池
        GenericObjectPoolConfig<Object> poolConfig = new GenericObjectPoolConfig<>();
        poolConfig.setMaxTotal(10); // 连接池中的最大连接数
        poolConfig.setMaxIdle(5); // 连接池中的最大空闲连接
        poolConfig.setMinIdle(1); // 连接池中的最小空闲连接(开机即保持一个连接)
        poolConfig.setMaxWaitMillis(1000L); // 当连接池资源耗尽时, 调用者最大阻塞时间, 超时将抛出异常

//        LettuceClientConfiguration
        LettucePoolingClientConfiguration lettucePoolingClientConfiguration =
                LettucePoolingClientConfiguration.builder()
                        .poolConfig(poolConfig)
                        .build();

        return new LettuceConnectionFactory(configuration, lettucePoolingClientConfiguration);
    }

//    /**
//     * redisTemplate 方式一 手动创建连接工厂
//     * @return
//     */
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(redisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setHashKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
//        template.setHashValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
//        return template;
//    }

    RedisConnectionFactory factory;

    /**
     * redisTemplate 方式二 自动创建连接工厂
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
        template.setHashValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
        return template;
    }


}
