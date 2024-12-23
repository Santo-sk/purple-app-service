package com.purple.pw_service.service.imp;

import com.purple.pw_service.entity.UserDetail;
import com.purple.pw_service.model.UserDetailModel;
import com.purple.pw_service.repository.UserDetailRepository;
import com.purple.pw_service.service.IUserDetailsService;
import com.purple.pw_service.util.CommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserDetailService implements IUserDetailsService {

    @Autowired
    UserDetailRepository userDetailRepo;

    public UserDetailModel saveUserDetail(UserDetailModel model){
        UserDetail userDetail=new UserDetail();
        userDetail.setFirstName(model.getFirstName());
        userDetail.setLastName(model.getLastName());
        userDetail.setDisplayName(model.getDisplayName());
        userDetail.setDob(model.getDob());
        userDetail.setMail(model.getMail());
        userDetail.setGender(model.getGender());
        userDetail.setContactNo(model.getContactNo());
        userDetail.setAudit(CommonService.setAudit(model.getDisplayName()));
        userDetailRepo.save(userDetail);
        return model;
    }

    public void deleteUser(String displayName){
        Optional<UserDetail> userDetail= Optional.ofNullable(userDetailRepo.findByDisplayName(displayName));
        userDetail.ifPresent(detail -> userDetailRepo.deleteById(detail.getUserKey()));
    }
}
