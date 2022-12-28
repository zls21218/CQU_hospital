package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *通知信息：(NotificationInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "NotificationInformation")
public class NotificationInformation implements Serializable {

    //NotificationInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_information_id")
    private Integer notification_information_id;
   // 编号
   @Basic
    private String number;
   // 通知类型
   @Basic
    private String notification_type;
   // 通知标题
   @Basic
    private String notice_title;
   // 患者
   @Basic
    private Integer patient;
   // 通知内容
   @Basic
    private String notice_content;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
