package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *门诊时间表：(OutpatientSchedule)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OutpatientSchedule")
public class OutpatientSchedule implements Serializable {

    //OutpatientSchedule编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outpatient_schedule_id")
    private Integer outpatient_schedule_id;
   // 科室类型
   @Basic
    private String department_type;
   // 科室号
   @Basic
    private String department_number;
   // 医生类型
   @Basic
    private String doctor_type;
   // 医生账号
   @Basic
    private Integer doctor_account;
   // 医生姓名
   @Basic
    private String name_of_doctor;
   // 照片
   @Basic
    private String photo;
   // 职称
   @Basic
    private String title;
   // 就诊时间
   @Basic
    private Timestamp visit_time;
   // 挂号费
   @Basic
    private Integer registration_fee;
   // 在诊状态
   @Basic
    private String diagnosis_status;
   // 总号数
   @Basic
    private Integer reservation_number;
   // 医生简介
   @Basic
    private String doctor_profile;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
