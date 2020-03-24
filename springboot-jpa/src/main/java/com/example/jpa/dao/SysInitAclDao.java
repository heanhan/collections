package com.example.jpa.dao;

import com.example.jpa.entity.pojo.SysInitAcl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaojh0912
 */
@Repository
public interface SysInitAclDao extends JpaRepository<SysInitAcl,Integer> , JpaSpecificationExecutor<SysInitAcl> {

    /**
     * 根据用户的类型获取资源的id
     * @param type
     * @return
     */
    @Query(value = "select res_id from sys_init_acl where subject_type=?1",nativeQuery = true)
    List<String> getResourceIds(String type);
}
