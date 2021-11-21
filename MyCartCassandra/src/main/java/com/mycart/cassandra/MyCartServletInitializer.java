package com.mycart.cassandra;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class MyCartServletInitializer extends SpringBootServletInitializer	{
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MyCartCassandraApplication.class);
	}

}




