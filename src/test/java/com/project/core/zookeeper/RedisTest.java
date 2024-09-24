package com.project.core.zookeeper;

import com.project.core.zookeeper.base.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * RedisTest
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 24, 2024</pre>
 */
public class RedisTest extends BaseTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void test() {
        redisTemplate.opsForValue().set("test", "123");
    }


}
