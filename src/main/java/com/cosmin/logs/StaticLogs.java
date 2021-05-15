package com.cosmin.logs;

public class StaticLogs {
	public static void staticLogs(org.slf4j.Logger log, String message) {
		log.info("<info>The application spring-boot-elk - {}.", message);
		log.error("<error>The application spring-boot-elk - {}.", message);
		log.debug("<debug>The application spring-boot-elk - {}.", message);
	}
}
