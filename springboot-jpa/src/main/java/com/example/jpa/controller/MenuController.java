package com.example.jpa.controller;

import com.example.jpa.entity.pojo.Role;
import com.example.jpa.entity.pojo.SysInitResource;
import com.example.jpa.service.SysInitAclService;
import com.example.jpa.service.SysInitResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户菜单
 * @author zhaojh0912
 */

@RestController
@RequestMapping(value = "/menu")
public class MenuController {

    @Autowired
    private SysInitAclService sysInitAclService;

    @Autowired
    private SysInitResourceService sysInitResourceService;


    /**
     * 根据根据用户的角色获取对应的菜单
     * 实现思路：
     * 1、获取登录用户的类型
     * 2、判断该类型用户所拥有的资源类型
     * 3、资源平台的资源中获取
     * @return
     */
    @GetMapping(value = "/getMenuByUser")
    public List<SysInitResource> getMenuByUser(){

        Role role=new Role();
        role.setId(1);
        role.setRole("admin");
        role.setRoleType("管理员");
        //根据用户的类型获取用户的拥有资源id
        List<String> resourceIds = sysInitAclService.getResourceIds(role.getRoleType());

        List<SysInitResource> thisRole = sysInitResourceService.getThisRole(resourceIds);

        /**
         * 得到用户的所有的菜单 形成菜单结构树
         * 1、得到所有的一级菜单
         * 2、得到所有的二级菜单
         * 3、递归封装成数
         */

        List<SysInitResource> parentMenu=new ArrayList<>();
        List<SysInitResource> childenMenu=new ArrayList<>();

        for (int i = 0; i < thisRole.size(); i++) {
            SysInitResource sysInitResource = thisRole.get(i);
            if(sysInitResource.getParentId().equals("0")){
                //如果父id 为0 则为一级菜单，添加到父节点
                parentMenu.add(sysInitResource);
            }
            //否则添加到子节点
            childenMenu.add(sysInitResource);
        }
        //
        for (SysInitResource parent:parentMenu) {
            List<SysInitResource> sysInitResources = iterateSysInitResource(childenMenu, parent.getResCode());
            parent.setChildren(sysInitResources);
        }
        if(childenMenu.size()>0){
            return parentMenu;
        }

        return null;
    }

    public List<SysInitResource> iterateSysInitResource(List<SysInitResource> list,String res){
        List<SysInitResource> result= new ArrayList<>();
        for (SysInitResource child:list) {
            //获取资源菜单的code
            String resCode = child.getResCode();
            //获取父节点的id
            String parentId = child.getParentId();
            if(parentId.equals(res)){
                //递归查询当前子节点的子节点
                List<SysInitResource> sysInitResources = iterateSysInitResource(list, resCode);
                child.setChildren(sysInitResources);
                result.add(child);
            }
        }
        return result;
    }
}
