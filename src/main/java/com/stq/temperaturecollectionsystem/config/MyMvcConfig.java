package com.stq.temperaturecollectionsystem.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/META_INF/resources/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/css");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //登陆页面
        registry.addViewController("/login.html").setViewName("login");

        //首页
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");

        //用户管理
        registry.addViewController("/user.html").setViewName("user");

        //出入管理
        registry.addViewController("/cogo.html").setViewName("cogo");

        //温度检测
        registry.addViewController("/temp.html").setViewName("temp");

    }
}
