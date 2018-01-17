package io.github.hmdusk.demo.core.mvc.mapper;

import io.github.hmdusk.demo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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
	public void setUp(){
	}

	@Test
	public void findByName() {
		User user = userMapper.findByName("zhang");
		System.out.println(user);
	}

	@Test
	public void insert() {
		userMapper.insert("zhang",30);
	}
}