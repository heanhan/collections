package com.example.jpa.service.impl;

import com.example.jpa.dao.SysInitAclDao;
import com.example.jpa.service.SysInitAclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaojh0912
 */
@Service
public class SysInitServiceImpl implements SysInitAclService {

    @Autowired
    private SysInitAclDao sysInitAclDao;

    /**
     * 根据用户类型湖区资源 的id 集合
     * @param type 用户类型
     * @return 资源的类型
     */
    @Override
    public List<String> getResourceIds(String type){
        List<String> resourceIds=sysInitAclDao.getResourceIds(type);
        return resourceIds;
    }
}
