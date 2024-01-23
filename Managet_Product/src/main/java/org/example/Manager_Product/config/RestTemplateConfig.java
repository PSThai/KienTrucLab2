/*
 * @(#) $NAME.java       1.0         1/19/2024
 * Copyright (c) 2024  IUH. All rights reserved.
 */
package org.example.Manager_Product.config;/*
 * @description:
 * @Author: Pham Sy Thai
 * Date:    1/19/2024
 * version: 1.0
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
