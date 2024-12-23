package com.purple.pw_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name="userDetail")
@Table(name="PWO001_USR_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TBO001_USR_K",nullable = false,unique = true)
    private Long userKey;

    @Column(name = "TBO001_USR_FST_NM",nullable = false)
    private String firstName;

    @Column(name = "TBO001_USR_LST_NM",nullable = false)
    private String lastName;

    @Column(name = "TBO001_USR_DSP_NM",nullable = false)
    private String displayName;

    @Column(name = "TBO001_USR_PH_NO",nullable = false)
    private String contactNo;

    @Column(name = "TBO001_USR_GNDR",nullable = false)
    private String gender;

    @Column(name = "TBO001_USR_DOB",nullable = false)
    private Date dob;

    @Column(name = "TBO001_USR_EML",nullable = false)
    private String mail;

    @Embedded
    @AttributeOverride(name="createdTime",column = @Column(name="TBO001_CREATE_S",nullable = false))
    @AttributeOverride(name="createdBy",column = @Column(name="TBO001_CREATE_USR_C",nullable = false))
    @AttributeOverride(name="lastModifiedTime",column = @Column(name="TBO001_LAST_UPDT_S",nullable = false))
    @AttributeOverride(name="lastModifiedBy",column = @Column(name="TBO001_LAST_UPDT_C",nullable = false))
    private Audit audit;
}
