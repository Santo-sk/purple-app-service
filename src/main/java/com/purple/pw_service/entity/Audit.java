package com.purple.pw_service.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Calendar;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Audit {

    @CreatedDate
    private Calendar createdTime;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private Calendar lastModifiedTime;

    @LastModifiedBy
    private String lastModifiedBy;
}
