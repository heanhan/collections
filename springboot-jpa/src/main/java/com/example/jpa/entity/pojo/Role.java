package com.example.jpa.entity.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;

/**
 * @author zhaojh0912
 * 用户实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sys_role")
public class Role {

    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 角色名称
     */
    @Column(name = "role_id")
    private String role;

    /**
     * 角色类型
     */
    @Column(name = "role_type")
    private String roleType;

}
