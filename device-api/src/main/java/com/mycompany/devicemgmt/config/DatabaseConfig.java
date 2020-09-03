package com.mycompany.devicemgmt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.mycompany.devicemgmt.repository")
public class DatabaseConfig {

}
