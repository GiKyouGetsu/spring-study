package com.wei.config;

import com.wei.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.wei.pojo")
@Import(WeiConfig2.class)
public class WeiConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}
