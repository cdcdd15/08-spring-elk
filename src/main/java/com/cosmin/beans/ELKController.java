package com.cosmin.beans;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmin.logs.StaticLogs;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/elk")
public class ELKController {
//	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ELKController.class);

	@GetMapping("/hello")
	public ResponseEntity<String> helloElk() {
		StaticLogs.staticLogs(log, "from REST endpoint");
		return new ResponseEntity<String>("Hello from ELK Spring Boot App", HttpStatus.OK);
	}

}