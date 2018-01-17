package io.github.hmdusk.demo.core.mvc.mapper;

import io.github.hmdusk.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author liming
 * @date Created in 2018/1/17 19:57
 */
@Mapper
public interface UserMapper {

	@Select("select * from user where name = #{name}")
	User findByName(@Param("name") String name);

	@Insert("insert into user(name, age) values(#{name},#{age})")
	int insert(@Param("name") String name,
	           @Param("age") Integer age);
}
