package io.github.hmdusk.demo.core.mvc.service.impl;

import io.github.hmdusk.demo.core.mvc.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liming
 * @date Created in 2018/1/17 19:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
	@Resource
	private UserService userService;

	@Before
	public void setUp() {
	}

	@Test
	public void create() {
		userService.create("test", 20);
	}

	@Test
	public void deleteByName() {
		userService.deleteByName("test");
	}

	@Test
	public void countUsers() {
		Integer result = userService.countUsers();
		System.out.println(result);
	}

	@Test
	public void deleteAllUser() {
		userService.deleteAllUser();
	}
}