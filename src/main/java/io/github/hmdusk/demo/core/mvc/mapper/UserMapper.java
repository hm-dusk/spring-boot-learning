package io.github.hmdusk.demo.core.mvc.mapper;

import io.github.hmdusk.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author liming
 * @date Created in 2018/1/17 19:57
 */
@Mapper
public interface UserMapper {

	/**
	 * 使用查询操作
	 *
	 * @param name 名称
	 * @return 详细信息
	 */
	@Select("select * from user where name = #{name}")
	User findByName(@Param("name") String name);

	/**
	 * 插入操作
	 *
	 * @param name 名
	 * @param age  年龄
	 * @return 成功返回1
	 */
	@Insert("insert into user(name, age) values(#{name},#{age})")
	int insert(@Param("name") String name,
	           @Param("age") Integer age);

	/**
	 * 使用map的方式插入
	 *
	 * @param map 键为name 和 age，类型对应<br>
	 *            key 对应不上不会抛异常，只是插入不了该值<br>
	 *            value 类型对应不上，能转化的能成功，比如把String "2"转成Integer 2，
	 *            类型不能转换的会抛org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.type.TypeException异常
	 * @return 成功返回1
	 */
	@Insert("insert into user(name, age) values(#{name, jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
	int insertByMap(Map<String, Object> map);

	/**
	 * 使用对象方式插入
	 *
	 * @param user 对象
	 * @return 成功返回1
	 */
	@Insert("insert into user(name, age) values(#{name},#{age})")
	int insertByUser(User user);

	/**
	 * 更新操作，使用map和@param同样有效
	 *
	 * @param user 对象
	 */
	@Update("update user set age=#{age} where name=#{name}")
	void update(User user);

	/**
	 * 删除操作
	 *
	 * @param id id
	 */
	@Delete("delete from user where id=#{id}")
	void delete(Long id);

	/**
	 * 返回结果的绑定
	 *
	 * @return @Result中的property属性对应返回值对象中的成员名，<br>
	 * column对应select出的字段名
	 */
	@Results({
			@Result(property = "name", column = "name"),
			@Result(property = "age", column = "age")
	})
	@Select("select name,age from user")
	List<User> findAll();
}
