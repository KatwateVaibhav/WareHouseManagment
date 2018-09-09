package com.fynd.warehouse.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.fynd" })
public class WareHouseStart extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application;
    }	
	
	public static void main(String[] args) {
		
		for(String arg:args) {
            System.out.println(arg);
        }
		SpringApplication.run(WareHouseStart.class, args);
	}	

}
