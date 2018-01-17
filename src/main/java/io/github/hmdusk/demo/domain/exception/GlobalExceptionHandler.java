package io.github.hmdusk.demo.domain.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liming
 * @date Created in 2018/1/16 9:26
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 全局异常捕捉处理
	 */
	@ExceptionHandler(value = Exception.class)
	public Map<String, String> errorHandler(Exception ex) {
		ex.printStackTrace();
		Map<String, String> map = new HashMap<>();
		map.put("statusCode", String.valueOf(500));
		map.put("message", ex.getMessage());
		return map;
	}

//	/**
//	 * 拦截捕捉自定义异常 MyException.class
//	 */
//	@ExceptionHandler(value = CustomException.class)
//	public Map<String, String> myErrorHandler(CustomException ex) {
//		Map<String, String> map = new HashMap<>();
//		map.put("message", ex.getMessage());
//		map.put("type", ex.getErrorType().toString());
//		map.put("module", ex.getModule());
//		map.put("statusCode", String.valueOf(ex.getStatusCode()));
//		return map;
//	}
}
