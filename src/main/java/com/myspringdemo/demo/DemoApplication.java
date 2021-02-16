/**************************************************************************
*Author        : AJAO HAZZAN                                              *
*Project Title : Data Injection                                           *
*DESCRIPTION   : I have created this project to demonstrate how           *
*                to implement data injection using different methods      *
*                of generating Getter and Setter .                        *
*                This demonstrated efficient way minimizing code length   *
**************************************************************************/


package com.myspringdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Director directorObj = context.getBean(Director.class);
        directorObj.releaseDirectorData();
    }

}
