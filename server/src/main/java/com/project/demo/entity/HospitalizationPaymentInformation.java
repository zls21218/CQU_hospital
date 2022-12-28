package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *住院缴费信息：(HospitalizationPaymentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HospitalizationPaymentInformation")
public class HospitalizationPaymentInformation implements Serializable {

    //HospitalizationPaymentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospitalization_payment_information_id")
    private Integer hospitalization_payment_information_id;
   // 科室类型
   @Basic
    private String department_type;
   // 科室号
   @Basic
    private String department_number;
   // 医生类型
   @Basic
    private String doctor_type;
   // 预约人
   @Basic
    private Integer appointment_person;
   // 病因记录
   @Basic
    private String etiological_record;
   // 住院号
   @Basic
    private String inpatient_number;
   // 住院时间
   @Basic
    private Timestamp length_of_stay;
   // 住院费用
   @Basic
    private Integer hospitalization_expenses;
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
