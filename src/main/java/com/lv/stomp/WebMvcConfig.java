package com.lv.stomp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 吕明亮
 * @Date : 2019/11/15 17:17
 * @Description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        System.out.println("addViewControllers");
        registry.addViewController("/chatroom").setViewName("/wechat_room");
    }
}
