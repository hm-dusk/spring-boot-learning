package io.github.hmdusk.demo.api.controller;

import io.github.hmdusk.demo.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author liming
 * @date Created in 2018/1/15 20:23
 */
@Api(tags = "用户页面",description = "有关用户的操作")
@RestController
@RequestMapping(value = "/users")
public class UserController {
	/**
	 * 创建线程安全的Map
	 */
	private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

	@ApiOperation(value = "查询所有用户信息", notes = "默认返回aaa")
	@GetMapping("/")
	public List<User> getUserList() {
		users.put(1L, new User(1L, "aaa", 20));
		return new ArrayList<>(users.values());
	}
}
