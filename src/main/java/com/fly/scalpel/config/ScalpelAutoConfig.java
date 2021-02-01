package com.fly.scalpel.config;

import com.fly.scalpel.spring.ScalpelContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guoxiang
 * @version 1.0.0
 * @since 2021/2/1
 */
@Configuration
@ConditionalOnProperty(value = "fly.scalpel.enable", matchIfMissing = true)
public class ScalpelAutoConfig {

    @Bean
    public ScalpelContext scalpelContext() {
        return new ScalpelContext();
    }

}
