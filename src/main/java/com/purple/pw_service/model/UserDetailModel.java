package com.purple.pw_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailModel {

    Long userKey;
    String firstName;
    String lastName;
    String displayName;
    String contactNo;
    String gender;
    Date dob;
    String mail;
    String password;

}
