package com.trony.springtheam;

import com.trony.springtheam.services.ProductService;
import com.trony.springtheam.services.impl.DefaultProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProductService productService() {
        return new DefaultProductService();
    }
}
