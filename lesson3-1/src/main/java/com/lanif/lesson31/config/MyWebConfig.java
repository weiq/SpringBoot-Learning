package com.lanif.lesson31.config;

import freemarker.template.TemplateException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.io.IOException;
import java.util.Properties;

@Configuration
public class MyWebConfig {
    @Bean
    public ViewResolver viewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(false);
        resolver.setViewClass(FreeMarkerView.class);
        resolver.setRequestContextAttribute("request");
        resolver.setExposeSpringMacroHelpers(true);
        resolver.setExposeRequestAttributes(true);
        resolver.setExposeSessionAttributes(true);
        resolver.setSuffix(".ftl");
        resolver.setContentType("text/html; charset=UTF-8");
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freemarkerConfig() throws IOException, TemplateException {
        FreeMarkerConfigurationFactory factory = new FreeMarkerConfigurationFactory();
        factory.setTemplateLoaderPaths("classpath:/templates/", "src/main/resources/templates");
        factory.setDefaultEncoding("UTF-8");

        FreeMarkerConfigurer result = new FreeMarkerConfigurer();
        freemarker.template.Configuration configuration = factory.createConfiguration();
        configuration.setClassicCompatible(true);
        result.setConfiguration(configuration);
        Properties settings = new Properties();
        settings.put("template_update_delay", "0");
        settings.put("default_encoding", "UTF-8");
        settings.put("number_format", "0.##########");
        settings.put("datetime_format", "yyyy-MM-dd HH:mm:ss");
        settings.put("classic_compatible", true);
        settings.put("template_exception_handler", "ignore");
        result.setFreemarkerSettings(settings);
        return result;
    }
}
