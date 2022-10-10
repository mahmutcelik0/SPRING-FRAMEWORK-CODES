package com.example.demo;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("application.properties") // loads property file to container
public class programConfigFile {

    @Bean
    //define bean for jeanAttribute
    public ATTRIBUTES jeanAttribute(){
        return new JeanAttribute();
    }

    @Bean
    //define bean for jean and inject dependency
    public CLOTHE jean(){
        return new Jean(jeanAttribute()); // New Jean object and depended with attribute (Dependency Injection)
    }

}
