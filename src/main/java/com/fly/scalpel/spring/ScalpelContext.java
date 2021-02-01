package com.fly.scalpel.spring;

import com.fly.scalpel.exception.LoadClassException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ClassUtils;

/**
 * @author guoxiang
 * @version 1.0.0
 * @since 2021/2/1
 * @apiNote 上下文，用于获取spring context中的bean
 */
@Slf4j
public class ScalpelContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static Class<?> getByClassName(String className) {
        try {
            return ClassUtils.forName(className, null);
        } catch (ClassNotFoundException e) {
            log.error("- class not find error", e);
            throw new LoadClassException(className);
        }
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        ScalpelContext.applicationContext = applicationContext;
    }
}
