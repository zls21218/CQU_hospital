package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *取消预约：(CancelReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CancelReservation")
public class CancelReservation implements Serializable {

    //CancelReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cancel_reservation_id")
    private Integer cancel_reservation_id;
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
    private String doctor_account;
   // 医生姓名
   @Basic
    private String name_of_doctor;
   // 职称
   @Basic
    private String title;
   // 挂号费
   @Basic
    private String registration_fee;
   // 取消时间
   @Basic
    private Timestamp cancel_time;
   // 取消人
   @Basic
    private Integer canceller;
   // 取消原因
   @Basic
    private String cancellation_reason;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
