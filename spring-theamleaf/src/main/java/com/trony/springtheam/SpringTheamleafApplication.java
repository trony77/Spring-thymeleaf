package com.trony.springtheam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@Slf4j
@ConfigurationPropertiesScan("com.trony.springtheam")
public class SpringTheamleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTheamleafApplication.class, args);
	}

}
