package com.config;

import com.com.mixMindDao.GeoIpImpl;
import com.com.mixMindDao.RoomImpl;
import com.hibernateSessionFactoryUtil.HibernateSessionFactoryUtil;
import com.webUtils.Data;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@ComponentScan("com")
@EnableWebMvc
public class Config implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");

    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


    @Bean
    public HibernateSessionFactoryUtil hibernateSessionFactoryUtil() {
        return new HibernateSessionFactoryUtil();
    }

    @Bean
    public SessionFactory sessionFactory() {
        return hibernateSessionFactoryUtil().getSessionFactory();

    }


    @Bean
    public Data data() {
        return new Data();
    }

    @Bean
    public GeoIpImpl geoIp() {
        return new GeoIpImpl(sessionFactory());
    }

    @Bean
    public RoomImpl room() {
        return new RoomImpl(sessionFactory());
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        return new HibernateTransactionManager(sessionFactory());
    }
}
