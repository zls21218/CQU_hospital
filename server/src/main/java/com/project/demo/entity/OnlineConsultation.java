package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *线上问诊：(OnlineConsultation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OnlineConsultation")
public class OnlineConsultation implements Serializable {

    //OnlineConsultation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "online_consultation_id")
    private Integer online_consultation_id;
   // 问诊编号
   @Basic
    private String interrogation_number;
   // 问诊类型
   @Basic
    private String type_of_consultation;
   // 问诊人
   @Basic
    private Integer interrogator;
   // 年龄
   @Basic
    private String age;
   // 性别
   @Basic
    private String gender;
   // 医生账号
   @Basic
    private Integer doctor_account;
   // 病因症状
   @Basic
    private String etiological_symptoms;
    // 审核状态
    @Basic
    private String examine_state;
    // 审核回复
    @Basic
    private String examine_reply;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
