package com.example.jpa.dao;

import com.example.jpa.entity.pojo.SysInitResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaojh0912
 */
@Repository
public interface SysInitResourceDao extends JpaRepository<SysInitResource,String>, JpaSpecificationExecutor<SysInitResource> {

    /**
     * 同构资源id 获取该用户的菜单
     * @param resIds 资源菜单的ids
     * @return 资源
     */
    @Query(value = " select * from sys_init_resource where res_id in(?1) ",nativeQuery = true)
    List<SysInitResource> getThisRole( List<String> resIds);

}
