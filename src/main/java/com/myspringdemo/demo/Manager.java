package com.myspringdemo.demo;

// Another Concept of Implementing Getter and Setter
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class Manager {
    private int managerId;
    private String managerName;
    public void releaseManagerData(){
        System.out.print("*****Data Released From Manager*****");
    }
}
