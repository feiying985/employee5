package com.employee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午1:52:08
 */
@MapperScan("com.employee.dao")   //mybatis mapper扫描
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//main中启动
		SpringApplication.run(Application.class,args);

	}

}
