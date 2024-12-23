package com.purple.pw_service.repository;

import com.purple.pw_service.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository  extends JpaRepository<UserDetail,Long> {

    UserDetail findByDisplayName(String name);
}
