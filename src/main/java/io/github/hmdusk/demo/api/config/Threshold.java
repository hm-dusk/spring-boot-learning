package io.github.hmdusk.demo.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liming
 * @date Created in 2018/1/11 16:56
 */
@Component
//@ConfigurationProperties(prefix = "io.github.hm-dusk")
public class Threshold {
	@Value("${io.github.hm-dusk.name}")
	private String name;
	@Value("${io.github.hm-dusk.email}")
	private String email;
	@Value("${io.github.hm-dusk.description}")
	private String description;
	@Value("${io.github.hm-dusk.random}")
	private String randomUUID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRandomUUID() {
		return randomUUID;
	}

	public void setRandomUUID(String randomUUID) {
		this.randomUUID = randomUUID;
	}
}
