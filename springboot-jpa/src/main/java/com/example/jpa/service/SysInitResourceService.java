package com.example.jpa.service;

import com.example.jpa.entity.pojo.SysInitResource;

import java.util.List;

public interface SysInitResourceService {

    /**
     * 同构资源id 获取该用户的菜单
     * @param resIds 资源菜单的ids
     * @return 资源
     */
    List<SysInitResource> getThisRole(List<String> resIds);
}
