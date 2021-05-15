package com.cosmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cosmin.logs.StaticLogs;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootElkApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootElkApplication.class, args);
		String message = "is started";
		StaticLogs.staticLogs(log, message);
	}
}
