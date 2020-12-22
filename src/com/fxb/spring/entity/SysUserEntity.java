package com.fxb.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author fengxianbin
 * @description: 用户实体
 * @create 2020-12-21 16:35
 */
@Component
public class SysUserEntity {

    @Value("${userid:0}")
    private String id;

    @Value("${username:0}")
    private String name;

    @Value("${usersex:0}")
    private String sex;

    @Value("${userage:0}")
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SysUserEntity() {
    }

    public SysUserEntity(String id, String name, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SysUserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
