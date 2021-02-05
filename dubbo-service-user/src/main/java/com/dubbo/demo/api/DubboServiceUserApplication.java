package com.dubbo.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.container.Main;
@EnableDubbo
@SpringBootApplication
public class DubboServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboServiceUserApplication.class, args);
		//Main.main(args);
	}

}
