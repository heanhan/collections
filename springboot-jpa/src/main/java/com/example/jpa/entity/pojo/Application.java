package com.example.jpa.entity.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 应用实体
 * @author zhaojh0912
 */
@Entity
@Table(name = "application")
@Data
public class Application {

    @Id
    private String id;

    private String appName;

    private Date createTIme;
}
