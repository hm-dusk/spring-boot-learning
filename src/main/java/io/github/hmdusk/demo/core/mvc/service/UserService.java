package io.github.hmdusk.demo.core.mvc.service;

/**
 * @author liming
 * @date Created in 2018/1/17 18:43
 */
public interface UserService {
	void create(String name, Integer age);

	void deleteByName(String name);

	Integer countUsers();

	void deleteAllUser();
}
