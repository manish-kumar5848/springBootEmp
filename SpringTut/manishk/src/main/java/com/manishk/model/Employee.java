package com.manishk.model;

public class Employee {
    private int id;
    private String name;
    private String emp_dept;
    private  double mobile;
    private String email;

    public Employee(int id, String name, String emp_dept, long mobile, String email) {
        this.setId(id);
        this.name = name;
        this.emp_dept = emp_dept;
        this.mobile = mobile;
        this.email = email;
    }
    public String getEmp_dept() {
        return emp_dept;
    }
    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }
    public Employee(){};
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMobile() {
        return mobile;
    }

    public void setMobile(double mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "employee [email=" + email + ", emp_dept=" + emp_dept + ", id=" + id + ", mobile=" + mobile + ", name="
                + name + "]";
    }

}
