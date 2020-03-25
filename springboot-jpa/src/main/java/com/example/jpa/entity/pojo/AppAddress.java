package com.example.jpa.entity.pojo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 应用地址
 * @author zhaojh0912
 */

@Entity
@Table(name = "app_address")
@Data
public class AppAddress {

    private String id;

    private String url;

}
