package me.won.springsecuritynote.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * JPA auditor enable
 */
@Configuration
@EnableJpaAuditing // JpaAuditing Enable
public class JpaAuditorConfig {
}
