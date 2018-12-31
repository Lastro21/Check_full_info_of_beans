package com.example.demo.config;

import com.example.demo.domain.TestBean88002000600;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class NativeConf {

    @Bean
    @Lazy
    public TestBean88002000600 invokeLazyBean(){
        return new TestBean88002000600();
    }
}
