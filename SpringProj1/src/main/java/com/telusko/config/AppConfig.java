package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Autowired Computer comp){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setComp(comp);
        return obj;
    }

    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        System.out.println("Default desktop object created");
        return new Desktop();
    }
    @Bean
//    @Scope("prototype")
    @Lazy
    public Desktop desk(){
        System.out.println("inside desk bean name can be aspecified  during dotBean");
        return new Desktop();
    }
    @Bean(name = "comp2")
    @Scope("prototype")
    @Lazy
    public Desktop desk2(){
        System.out.println("desk 2 is created");
        return new Desktop();
    }
}
