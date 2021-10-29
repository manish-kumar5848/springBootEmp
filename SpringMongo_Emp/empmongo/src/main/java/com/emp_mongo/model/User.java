package com.emp_mongo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "User")
public class User implements Serializable {
    @NonNull
    @NotBlank
    private String UserName;
    @NonNull
    @NotBlank
    @Size(min = 8 ,message = "PassWord Should be of length 8")
    private  String password;


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

}
