package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *患者报告：(PatientReport)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PatientReport")
public class PatientReport implements Serializable {

    //PatientReport编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_report_id")
    private Integer patient_report_id;
   // 科室类型
   @Basic
    private String department_type;
   // 科室号
   @Basic
    private String department_number;
   //  医生类型
   @Basic
    private String doctor_type;
   // 预约人
   @Basic
    private String appointment_person;
   // 姓名
   @Basic
    private String full_name;
   // 年龄
   @Basic
    private String age;
   // 报告详情
   @Basic
    private String report_details;
   // 医生
   @Basic
    private Integer doctor;
   // 看诊时间
   @Basic
    private Timestamp visiting_time;
   // 病因记录
   @Basic
    private String etiological_record;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
