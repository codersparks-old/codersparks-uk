package com.github.codersparks.codersparksuk.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by codersparks on 20/01/2017.
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "codersparks")
public class CodersparksConfiguration {

    private String secret;
}
