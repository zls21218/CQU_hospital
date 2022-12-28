package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *核酸检测：(NucleicAcidTest)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "NucleicAcidTest")
public class NucleicAcidTest implements Serializable {

    //NucleicAcidTest编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nucleic_acid_test_id")
    private Integer nucleic_acid_test_id;
   // 编号
   @Basic
    private String number;
   // 检测费用
   @Basic
    private String testing_cost;
   // 检测地点
   @Basic
    private String testing_location;
   // 门诊时间
   @Basic
    private String outpatient_time;
   // 图片
   @Basic
    private String picture;
   // 注意事项
   @Basic
    private String matters_needing_attention;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
