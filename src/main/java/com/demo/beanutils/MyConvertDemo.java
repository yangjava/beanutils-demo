package com.demo.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

import java.util.Date;

public class MyConvertDemo {

    public static void main(String[] args) throws Exception {

        MyConverter converter = new MyConverter("yyyy-MM-dd HH:mm:ss");
        // 注册该转换器
        ConvertUtils.register(converter, Date.class);
        Object object3 = ConvertUtils.convert("2019-03-13 14:04:00", Date.class);
        System.out.println(object3.getClass().getTypeName());
        System.out.println(object3);


        // BeanUtils设置属性时，自动进行类型转换
        MyConverter myConverter = new MyConverter("yyyy-MM-dd HH:mm:ss");
        // 注册该转换器
        ConvertUtils.register(myConverter, Date.class);
        UserDate userDate = new UserDate();
        BeanUtils.copyProperty(userDate, "birthDay", "2019-03-13 14:04:00");
        System.out.println(userDate);
    }
}
