package io.github.hmdusk.demo.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liming
 * @date Created in 2018/1/15 20:47
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				// 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
				.apis(RequestHandlerSelectors.basePackage("io.github.hmdusk.demo.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {// 创建API的基本信息，这些信息会在Swagger UI中进行显示
		return new ApiInfoBuilder()
				//Api标题
				.title("Spring Boot 测试页面")
				//Api描述
				.description("测试")
				//联系人
				.contact(new Contact("liming", "", ""))
				//版本号
				.version("0.1")
				.license("貍铭工作室")
				.licenseUrl("hm-dusk.github.io")
				.build();
	}

//	@Bean
//	UiConfiguration uiConfiguration() {
//		UiConfiguration uiConfiguration = new UiConfiguration(null);
//		return uiConfiguration;
//	}
}
