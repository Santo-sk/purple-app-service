package com.purple.pw_service.repository;

import com.purple.pw_service.entity.UserPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailCredRepository extends JpaRepository<UserPassword,Long> {

    UserPassword findByUserDetailUserKey(Long userKey);
}
