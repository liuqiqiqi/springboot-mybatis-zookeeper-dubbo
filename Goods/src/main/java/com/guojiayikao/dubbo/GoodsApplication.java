package com.guojiayikao.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@EnableDubbo
@MapperScan("com.guojiayikao.dubbo.dao") //扫描的mapper
@SpringBootApplication
@ImportResource(locations="classpath:provider.xml")
public class GoodsApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GoodsApplication.class, args);
		System.out.println("start dubbo...");
		new CountDownLatch(1).await();
	}

}
