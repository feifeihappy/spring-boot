package com.example.springbootmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


//SpringBoot自动配置原理
//https://zhuanlan.zhihu.com/p/345895748?utm_medium=social&utm_psn=1811085047232610308&utm_source=wechat_session
//https://juejin.cn/post/7046554366068654094
//springboot 注解
@SpringBootApplication
public class SpringBootMyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyApplication.class, args);
	}

}
