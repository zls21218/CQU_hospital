package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *预约挂号：(HaveAnAppointmentWithADoctor)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HaveAnAppointmentWithADoctor")
public class HaveAnAppointmentWithADoctor implements Serializable {

    //HaveAnAppointmentWithADoctor编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "have_an_appointment_with_a_doctor_id")
    private Integer have_an_appointment_with_a_doctor_id;
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
   // 职称
   @Basic
    private String title;
   // 挂号费
   @Basic
    private String registration_fee;
   // 预约时间
   @Basic
    private Timestamp time_of_appointment;
   // 预约人
   @Basic
    private Integer appointment_person;
   // 姓名
   @Basic
    private String full_name;
   // 年龄
   @Basic
    private String age;
   // 性别
   @Basic
    private String gender;
   // 预约号数
   @Basic
    private Integer reservation_number;
   // 症状
   @Basic
    private String symptom;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
