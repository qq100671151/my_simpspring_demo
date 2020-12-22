package com.fxb.spring.testmain;


import com.fxb.spring.service.SysUserFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fengxianbin
 * @description: 测试spring
 * @create 2020-12-22 9:18
 */
public class SpringHelloWord {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        SysUserFacade sysUserFacade=applicationContext.getBean(SysUserFacade.class);
        sysUserFacade.say();
    }
}
