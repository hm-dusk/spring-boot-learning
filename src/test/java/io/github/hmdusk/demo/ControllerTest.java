package io.github.hmdusk.demo;

import io.github.hmdusk.demo.api.config.Threshold;
import io.github.hmdusk.demo.api.controller.Controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liming
 * @date Created in 2018/1/11 16:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
	@Resource
	private Controller controller;
	@Resource
	private Threshold threshold;

	@Test
	public void say() {
		String s = controller.say();
		System.out.println(s);
	}

	@Test
	public void testThreshold(){
		assert threshold.getName().equals("liming");
		assert threshold.getEmail().equals("cqupt@163.com");
		System.out.println(threshold.getDescription());
		System.out.println(threshold.getRandomUUID());
	}
}