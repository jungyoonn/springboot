package com.eeerrorcode.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Component
@Service
@Controller
@ComponentScan(basePackages = "com.eeerrorcode.di")
public class DiApplication {

	// bean을 등록하려면 위 어노테이션들이 필요하다, 어노테이션이 없을 때 반환 대상이 인스턴스면 빈이 됨
	@Bean
	public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args);
	}

}
