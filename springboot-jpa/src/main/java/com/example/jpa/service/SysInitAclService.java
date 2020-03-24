package com.example.jpa.service;

import java.util.List;

/**
 * @author zhaojh0912
 */
public interface SysInitAclService {

    /**
     * 根据用户类型湖区资源 的id 集合
     * @param type 用户类型
     * @return 资源的类型
     */
    List<String> getResourceIds(String type);
}
