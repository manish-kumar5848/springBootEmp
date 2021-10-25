package com.manishk.services;
import com.manishk.model.Employee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

@Component
@Service
public class EmployeeService {
    private static List<Employee> list = new ArrayList<Employee>();
    static{
        list.add(new Employee(12354,"harshit","IT",897874578,"ihktripathti@gmail.com"));
        list.add(new Employee(12334,"Anant","IT",897874578,"aman@gmail.com"));

    }

    public List<Employee> getallEmployee()
    {   System.out.println("list");
        return list;
    }
    public Employee getEmployeeById(int id){
        Employee employee = null;
    employee =list.stream().filter(e ->e.getId()==id).findFirst().get();
    return employee;
}
  public Employee addEmployee(Employee employee){
      list.add(employee);
      return employee;
  }
  public void removeEmployee(int id){
     list= list.stream().filter(e->{
          if(e.getId()==id){
              return true;
          }else {
              return false;
          }
      }).collect(Collectors.toList());
  }
  public void updateEmployee(Employee emp, int id){
       list= list.stream().map(newemp->{
            if(newemp.getId()==id){
                newemp.setEmp_dept(emp.getEmp_dept());
                newemp.setEmail(emp.getEmail());
                newemp.setMobile(emp.getMobile());
            }
            return  newemp;
        }).collect(Collectors.toList());
  }
}
