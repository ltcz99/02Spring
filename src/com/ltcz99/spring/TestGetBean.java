package com.ltcz99.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {

    public static void main(String[] args) {

        //1.传统方法，不使用Spring时，需要自己创建对象
        Food food=new Food();
        food.setName("香蕉");
        Person p=new Person("xiami",18,food);
        System.out.println(p);

        //2.使用spring时，利用控制反转（IOC），不需要自己创建对象，就可以实现实例化
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=(Person) ctx.getBean("person");
        System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(ToStringBuilder.reflectionToString(ctx,ToStringStyle.MULTI_LINE_STYLE));
    }
}
