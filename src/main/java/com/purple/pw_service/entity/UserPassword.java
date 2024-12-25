package com.purple.pw_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="userPassword")
@Table(name="pwo002_usr_cred")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPassword {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="tbo002_usr_cred_k",nullable = false,unique = true)
        private Long userPassKey;

        @OneToOne
        @MapsId
        @JoinColumn(name = "TBO001_USR_K")
        private UserDetail userDetail;

        @Column(name = "tbo002_usr_cred_pswd",nullable = false)
        private String password;

        @Embedded
        @AttributeOverride(name="createdTime",column = @Column(name="tbo002_create_s",nullable = false))
        @AttributeOverride(name="createdBy",column = @Column(name="tbo002_create_usr_c",nullable = false))
        @AttributeOverride(name="lastModifiedTime",column = @Column(name="tbo002_last_updt_s",nullable = false))
        @AttributeOverride(name="lastModifiedBy",column = @Column(name="tbo002_last_updt_c",nullable = false))
        private Audit audit;
}
