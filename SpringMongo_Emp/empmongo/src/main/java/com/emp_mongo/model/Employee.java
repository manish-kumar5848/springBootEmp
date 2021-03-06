package com.emp_mongo.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "Employees")
public class Employee implements Serializable {

    @Id
    private String id;

    private String empId;
    private String Name;
    private String emp_dept;
    private  String mobile;
    private String email;
    private String salary;

}
