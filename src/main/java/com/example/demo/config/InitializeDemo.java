package com.example.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 周瑶
 * @description TODO
 * @Date: 2018/11/6
 */
@Configuration
public class InitializeDemo implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("程序启动！");
    }
}
