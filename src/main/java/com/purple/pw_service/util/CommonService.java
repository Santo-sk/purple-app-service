package com.purple.pw_service.util;

import com.purple.pw_service.entity.Audit;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class CommonService {

    public static Audit setAudit(String user){
        Audit audit=new Audit();
        audit.setCreatedBy(user);
        audit.setCreatedTime(Calendar.getInstance());
        audit.setLastModifiedBy(user);
        audit.setLastModifiedTime(Calendar.getInstance());
        return audit;
    }
}
