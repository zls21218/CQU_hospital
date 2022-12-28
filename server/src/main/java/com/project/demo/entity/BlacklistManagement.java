package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *黑名单管理：(BlacklistManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "BlacklistManagement")
public class BlacklistManagement implements Serializable {

    //BlacklistManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blacklist_management_id")
    private Integer blacklist_management_id;
   // 编号
   @Basic
    private String number;
   // 黑名单类型
   @Basic
    private String blacklist_type;
   // 次数
   @Basic
    private String frequency;
   // 患者账号
   @Basic
    private Integer patient_account_number;
   // 原因
   @Basic
    private String reason;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
