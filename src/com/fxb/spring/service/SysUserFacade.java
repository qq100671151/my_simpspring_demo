package com.fxb.spring.service;

import com.fxb.spring.entity.SysUserEntity;

/**
 * @author fengxianbin
 * @description: 用户接口
 * @create 2020-12-22 9:44
 */
public interface SysUserFacade {

    SysUserEntity getSysUserEntity();

    void say();
}
