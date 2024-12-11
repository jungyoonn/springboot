package com.eeerrorcode.di.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.eeerrorcode.di.service.PostService;
import com.eeerrorcode.di.service.PostServiceImplNomal;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PostTest {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PostTest.class);
        ApplicationContext ctx = app.run(args);
        PostService service = ctx.getBean(PostServiceImplNomal.class);
        service.list().forEach(log::info);
    }
}
