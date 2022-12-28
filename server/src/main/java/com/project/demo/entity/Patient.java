package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *患者：(Patient)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Patient")
public class Patient implements Serializable {

    //Patient编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patient_id;
   // 性别
   @Basic
    private String gender;
   // 年龄
   @Basic
    private String age;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
