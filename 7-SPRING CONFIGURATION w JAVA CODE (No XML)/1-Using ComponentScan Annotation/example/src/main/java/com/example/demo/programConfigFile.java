package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class programConfigFile {

    /* ---- EXAMPLE THAT DON'T USE COMPONENTSCAN
    @Bean
    public ATTRIBUTES jeanAttribute(){
        return new JeanAttribute();
    }

    @Bean
    public CLOTHE jean(ATTRIBUTES jeanAttribute){
        return new Jean(jeanAttribute);
    }

     */

}
