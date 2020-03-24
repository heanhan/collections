package com.example.jpa.entity.pojo;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhaojh0912
 */

@Entity
@Table(name = "sys_init_resource")
@Data
public class SysInitResource {

    /**
     * 资源标识
     */
    @Id
    @Column(name = "res_id")
    private String resId;

    /**
     * 资源编码
     */
    @Column(name = "res_code")
    private String resCode;

    /**
     *资源名称
     */
    @Column(name = "res_name")
    private String resName;

    /**
     *资源类型
     */
    @Column(name = "res_type")
    private String resType;

    /**
     *资源图标
     */
    @Column(name = "res_icon")
    private String resIcon;

    /**
     *资源访问url
     */
    @Column(name = "res_url")
    private String resUrl;

    /**
     *资源顺序
     */
    @Column(name = "res_seq")
    private int resSeq;

    /**
     *资源状态
     */
    @Column(name = "res_status")
    private String resStatus;

    /**
     *上级资源
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     *资源层级
     */
    @Column(name = "res_height")
    private int resHeight;

    /**
     *访问规则
     */
    @Column(name = "rule_value")
    private int ruleValue;

    /**
     *创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     *创建用户
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     *时间戳
     */
    @Column(name = "data_stamp")
    private Date dataStamp;

    @ElementCollection
    @Transient
    public List<SysInitResource> children=new ArrayList<>();
}
