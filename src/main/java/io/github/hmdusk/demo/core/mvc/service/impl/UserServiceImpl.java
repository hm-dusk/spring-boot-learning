package io.github.hmdusk.demo.core.mvc.service.impl;

import io.github.hmdusk.demo.core.mvc.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liming
 * @date Created in 2018/1/17 18:43
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(String name, Integer age) {
		jdbcTemplate.update("INSERT INTO user(name , age) VALUES (?,?)", name, age);
	}

	@Override
	public void deleteByName(String name) {
		jdbcTemplate.update("DELETE FROM user WHERE name = ?", name);
	}

	@Override
	public Integer countUsers(){
		return jdbcTemplate.queryForObject("SELECT count(1) FROM user",Integer.class);
	}

	@Override
	public void deleteAllUser(){
		jdbcTemplate.update("DELETE FROM user");
	}
}
