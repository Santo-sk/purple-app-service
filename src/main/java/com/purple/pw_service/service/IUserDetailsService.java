package com.purple.pw_service.service;

import com.purple.pw_service.model.UserDetailModel;

public interface IUserDetailsService {

    UserDetailModel saveUserDetail(UserDetailModel model);

    void deleteUser(String displayName);

    Boolean checkUserNameExist(String displayName);

    Boolean checkMailExist(String mail);

    Boolean checkContactNoExist(String contactNo);
}
