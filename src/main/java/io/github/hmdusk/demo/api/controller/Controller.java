package io.github.hmdusk.demo.api.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liming
 * @date Created in 2018/1/11 16:37
 */
@Api(tags = "测试页面")
@RestController
public class Controller {

	@GetMapping("/hello")
	public String say() {
		return "你好，Spring Boot";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
