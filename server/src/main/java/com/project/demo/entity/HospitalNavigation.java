package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *医院导航：(HospitalNavigation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HospitalNavigation")
public class HospitalNavigation implements Serializable {

    //HospitalNavigation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_navigation_id")
    private Integer hospital_navigation_id;
   // 编号
   @Basic
    private String number;
   // 地名
   @Basic
    private String place_name;
   // 地址
   @Basic
    private String address;
   // 图片
   @Basic
    private String picture;
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
