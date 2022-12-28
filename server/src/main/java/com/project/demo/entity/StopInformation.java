package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *停诊信息：(StopInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "StopInformation")
public class StopInformation implements Serializable {

    //StopInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stop_information_id")
    private Integer stop_information_id;
   // 编号
   @Basic
    private String number;
   // 停诊时间
   @Basic
    private Timestamp stopping_time;
   // 停诊医生
   @Basic
    private Integer stopping_doctor;
   // 停诊科室
   @Basic
    private String stopping_department;
   // 医生姓名
   @Basic
    private String name_of_doctor;
   // 职称
   @Basic
    private String title;
   // 图片
   @Basic
    private String picture;
   // 停诊安排
   @Basic
    private String stopping_arrangement;
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
