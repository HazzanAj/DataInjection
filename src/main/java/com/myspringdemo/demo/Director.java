package com.myspringdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
    private int directorId;
    private String directorName;
    // Established Connection With Director Class By Using AutoWired Annotation
    @Autowired
    private Admin adminObj;
    @Autowired
    private Manager managerObj;
    @Autowired
    private Employee employeeObj;
    // Implemented Getter and Setter With This Concept
    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Admin getAdminObj() {
        return adminObj;
    }

    public void setAdminObj(Admin adminObj) {
        this.adminObj = adminObj;
    }

    public Manager getManagerObj() {
        return managerObj;
    }

    public void setManagerObj(Manager managerObj) {
        this.managerObj = managerObj;
    }

    public Employee getEmployeeObj() {
        return employeeObj;
    }

    public void setEmployeeObj(Employee employeeObj) {
        this.employeeObj = employeeObj;
    }

    public void releaseDirectorData(){
        System.out.println("******Data Released From Director Successfully*****");
        managerObj.releaseManagerData();
        employeeObj.releaseEmployeeData();
        adminObj.releaseAdminData();
}
}