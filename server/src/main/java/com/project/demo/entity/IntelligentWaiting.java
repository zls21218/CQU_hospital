package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *智能候诊：(IntelligentWaiting)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "IntelligentWaiting")
public class IntelligentWaiting implements Serializable {

    //IntelligentWaiting编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intelligent_waiting_id")
    private Integer intelligent_waiting_id;
   // 科室类型
   @Basic
    private String department_type;
   // 科室号
   @Basic
    private String department_number;
   // 医生类型
   @Basic
    private String doctor_type;
   // 候诊时间
   @Basic
    private String waiting_time;
   // 候诊人数
   @Basic
    private Integer waiting_number;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
