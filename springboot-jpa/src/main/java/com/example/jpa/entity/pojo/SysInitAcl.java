package com.example.jpa.entity.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @author zhaojh0912
 */

@Entity
@Table(name = "sys_init_acl")
@Data
public class SysInitAcl {
    /**
     *  访问规则标识
     */
    @Id
    @Column(name = "acl_id")
    private int aclId;

    /**
     *资源标识
     */
    @Column(name = "res_id")
    private String resId;

    /**
     *主体标识
     */
    @Column(name = "subject_id")
    private String subjectId;

    /**
     *主体类型
     */
    @Column(name = "subject_type")
    private String subjectType;


}
