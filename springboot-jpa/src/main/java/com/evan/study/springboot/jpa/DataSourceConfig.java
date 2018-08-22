package com.evan.study.springboot.jpa;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Auther: Administrator
 * @Date: 2018/8/16 22:16
 * @Description: 数据库配置对象
 */
@Configuration
@PropertySource(value = "classpath:application.yml")
public class DataSourceConfig {

    @Value("${druid.stat.view.allow}")
    private String allow;
    @Value("${druid.stat.view.deny}")
    private String deny;
    @Value("${druid.stat.view.loginUsername}")
    private String loginUsername;
    @Value("${druid.stat.view.loginPassword}")
    private String loginPassword;
    @Value("${druid.stat.view.resetEnable}")
    private String resetEnable;
    @Value("${druid.stat.filter.urlPatterns}")
    private String urlPatterns;

   /* @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }*/

    @Bean
    public ServletRegistrationBean druidStatViewServlet(){

        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        registrationBean.addInitParameter("allow",allow);
        registrationBean.addInitParameter("deny",deny);
        registrationBean.addInitParameter("loginUsername",loginUsername);
        registrationBean.addInitParameter("loginPassword",loginPassword);
        registrationBean.addInitParameter("resetEnable",resetEnable);

        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean druidStatFilter(){

        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new WebStatFilter());
        registrationBean.addUrlPatterns(urlPatterns);
        registrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return registrationBean;
    }


}
