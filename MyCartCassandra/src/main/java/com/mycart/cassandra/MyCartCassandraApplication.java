package com.mycart.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author HP
 *
 */
@SpringBootApplication
@ComponentScan(value = { "com.mycart.controller.*", "com.mycart.service.*", "com.mycart.dto.*", "com.mycart.repository","com.mycart.*" })
@EnableAutoConfiguration
@EnableWebMvc
public class MyCartCassandraApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyCartCassandraApplication.class, args);
	}
}
