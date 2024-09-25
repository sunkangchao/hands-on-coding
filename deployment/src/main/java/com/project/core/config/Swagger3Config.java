package com.project.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket; /**
 * Swagger3Config
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 25, 2024</pre>
 */
@Configuration
@EnableOpenApi
public class Swagger3Config {

    @Bean
    public Docket api() {
        // swagger访问路径http://localhost:8091/swagger-ui/index.html
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.project.core.controller"))   // 替换为您的Controller所在的包路径
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后端接口文档")    // 文档标题
                .description("前后端交互接口") // 文档路径
                .version("1.0.0")   // 文档版本
                .build();
    }
}
