package com.employee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.employee.interceptors.LoginInterceptor;
/**
 * 
 * @author lanzefei
 * @date 2019年6月21日 下午2:42:25
 */
@Configuration     //表明这是一个配置类
public class WebConfigurer implements WebMvcConfigurer {
	@Autowired
	private LoginInterceptor loginInterceptor;
	//静态资源处理
    @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}

	//注册自定义的拦截器loginInterceptor
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/loginHandle","/quitHandle") 表示除了登陆处理与退出处理之外
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/loginHandle","/quitHandle",
        		"/getAllUser","/saveUser","/deleteUser","/updateUser");  //用户操作属于后台管理系统，不拦截
	}
}
