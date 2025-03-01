package com.example.springboot_2ndapp.Controller;

import com.example.springboot_2ndapp.Beans.EmployeeBean;
import com.example.springboot_2ndapp.Beans.DepartmentBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springboot_2ndapp.Beans", "com.example.springboot_2ndapp.Controller"})
public class DemoApplication {

    public static void main(String[] args) {
        // ApplicationContext retrieve karo
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // EmployeeBean aur DepartmentBean objects retrieve karo
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        DepartmentBean departmentBean = context.getBean(DepartmentBean.class);

        // Objects print karo
        System.out.println("Employee Bean: " + employeeBean);
        System.out.println("Department Bean: " + departmentBean);
    }
}