package com.kobe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()  // 选择那些路径和api会生成document
                    .apis(RequestHandlerSelectors.basePackage("com.kobe.controller"))
                    .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                    .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                    .paths(PathSelectors.any()) // 对所有路径进行监
                .build();
    }

    private ApiInfo getApiInfo(){
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Kobe项目模板")
                .description("描述信息")
                .version("1.1")
                .build();
        return apiInfo;
    }
}