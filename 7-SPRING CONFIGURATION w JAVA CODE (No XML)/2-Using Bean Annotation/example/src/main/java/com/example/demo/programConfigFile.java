package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class programConfigFile {

    @Bean
    //define bean for jeanAttribute
    public ATTRIBUTES jeanAttribute(){
        return new JeanAttribute();
    }

    @Bean
//    @Scope("prototype"
    //define bean for jean and inject dependency
    public CLOTHE jean(){
        return new Jean(jeanAttribute()); // New Jean object and depended with attribute (Dependency Injection)
    }

}
