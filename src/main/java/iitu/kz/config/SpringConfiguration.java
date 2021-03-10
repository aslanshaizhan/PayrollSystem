package iitu.kz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "iitu.kz")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "iitu.kz")
public class SpringConfiguration {
}
