package com.fxb.spring.service;

import com.fxb.spring.dao.SysUserDao;
import com.fxb.spring.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fengxianbin
 * @description: 用户实现
 * @create 2020-12-22 9:44
 */
@Service
public class SysUserFacadeImpl implements  SysUserFacade{

    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public SysUserEntity getSysUserEntity() {
        return sysUserDao.getSysUserEntity();
    }

    @Override
    public void say() {
        System.out.println("1234567");
    }

}
