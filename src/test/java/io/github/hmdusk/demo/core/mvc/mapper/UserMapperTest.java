package io.github.hmdusk.demo.core.mvc.mapper;

import io.github.hmdusk.demo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liming
 * @date Created in 2018/1/17 20:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	@Resource
	private UserMapper userMapper;

	@Before
	public void setUp() {
	}

	@Test
	public void findByName() {
		User user = userMapper.findByName("zhang");
		System.out.println(user);
	}

	@Test
	public void insert() {
		int result = userMapper.insert("zhang", 30);
		System.out.println(result);
	}

	@Test
	public void insertByMap() {
		Map<String, Object> map = new HashMap<>(2);
		map.put("name", "wang");
		map.put("age", 86);
		int result = userMapper.insertByMap(map);
		System.out.println(result);
	}

	@Test
	public void insertByUser() {
		User user = new User("user", 10000);
		int result = userMapper.insertByUser(user);
		System.out.println(result);
	}

	@Test
	public void update() {
		User user = new User("user", 2018);
		userMapper.update(user);
	}

	@Test
	public void delete() {
		userMapper.delete(5L);
	}

	@Test
	public void findAll() {
		List<User> users = userMapper.findAll();
		System.out.println(users);
	}
}