package com.itheima.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.itheima"})//代表springboot运行的主类
public class Application {
public static void main(String[] args) {
	/** 运行springboot应用*//*
	SpringApplication.run(Application.class, args);*/
	//创建springApplication应用对象
	SpringApplication springApplication=new SpringApplication(Application.class);
	//设置springlogo关闭
	springApplication.setBannerMode(Banner.Mode.OFF);
	//运行
	springApplication.run(args);
}
}
