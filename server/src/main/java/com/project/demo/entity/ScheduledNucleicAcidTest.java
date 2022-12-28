package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *预约核酸检测：(ScheduledNucleicAcidTest)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ScheduledNucleicAcidTest")
public class ScheduledNucleicAcidTest implements Serializable {

    //ScheduledNucleicAcidTest编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scheduled_nucleic_acid_test_id")
    private Integer scheduled_nucleic_acid_test_id;
   // 编号
   @Basic
    private String number;
   // 检测费用
   @Basic
    private String testing_cost;
   // 检测地点
   @Basic
    private String testing_location;
   // 预约时间
   @Basic
    private Timestamp time_of_appointment;
   // 预约人
   @Basic
    private Integer appointment_person;
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
