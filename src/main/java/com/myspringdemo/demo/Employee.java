/* Here I am using new concepts this 3rd concept,@Data concept.*/

package com.myspringdemo.demo;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Employee {
    private int employeeId;
    private String employeeName;
    public void releaseEmployeeData(){
        System.out.println("*****Data Released From Employee*****");
    }
}
