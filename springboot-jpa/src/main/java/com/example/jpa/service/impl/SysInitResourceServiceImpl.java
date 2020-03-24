package com.example.jpa.service.impl;

import com.example.jpa.dao.SysInitResourceDao;
import com.example.jpa.entity.pojo.SysInitResource;
import com.example.jpa.service.SysInitResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaojh0912
 */
@Service
public class SysInitResourceServiceImpl implements SysInitResourceService {

    @Autowired
    private SysInitResourceDao sysInitResourceDao;

    /**
     * 同构资源id 获取该用户的菜单
     * @param resIds 资源菜单的ids
     * @return 资源
     */
    @Override
    public List<SysInitResource> getThisRole(List<String> resIds){
        return sysInitResourceDao.getThisRole(resIds);
    }
}
