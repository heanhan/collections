package com.example.jpa.entity.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author zhaojh0912
 * 用户实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "collection_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "nick_Name")
    private String nickName;

    @Column(name = "sex")
    private String sex;

    @Column(name = "tel_Phone")
    private String telPhone;

    @Column(name = "age")
    private Integer age;

}
