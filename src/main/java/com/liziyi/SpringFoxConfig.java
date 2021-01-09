package com.liziyi;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/9 9:03
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class SpringFoxConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.liziyi.tang"))
//                .paths(PathSelectors.ant("/v2/**"))
                .build()
                .apiInfo(getApiInfo());
    }
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "tang api文档",
                "描述暂无",
                "V1.0",
                "http://www.baidu.com",
                new Contact("liziyi", "http://www.baidu.com", "17716570394@163.com"),
                "LICENSE",
                "http://www.baidu.com",
                Collections.emptyList()
        );
    }
}
