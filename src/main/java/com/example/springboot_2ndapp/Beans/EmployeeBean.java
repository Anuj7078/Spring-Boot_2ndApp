package com.example.springboot_2ndapp.Beans;

import com.example.springboot_2ndapp.Beans.DepartmentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName = "Mark";

    // Dependency Injection using @Autowired
    @Autowired
    private DepartmentBean departmentBean;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "employeeName='" + employeeName + '\'' +
                ", departmentBean=" + departmentBean +
                '}';
    }
}