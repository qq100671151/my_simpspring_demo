package com.fxb.spring.dao;

import com.fxb.spring.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author fengxianbin
 * @description: 用户dao层
 * @create 2020-12-22 9:42
 */
@Repository
public class SysUserDao {

    @Autowired
    private SysUserEntity sysUserEntity;

    public SysUserEntity getSysUserEntity() {
        return sysUserEntity;
    }
}
