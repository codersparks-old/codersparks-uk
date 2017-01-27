package com.github.codersparks.codersparksuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by codersparks on 20/01/2017.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Bean
    public TemplateEngine templateEngine(SpringSecurityDialect springSecurityDialect) {
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();

        Set<IDialect> dialectSet = new HashSet<>();
        dialectSet.add(springSecurityDialect);
        springTemplateEngine.setAdditionalDialects(dialectSet);

        return springTemplateEngine;
    }

    @Bean
    public SpringSecurityDialect springSecurityDialect() {
        return new SpringSecurityDialect();
    }

    public static final void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
