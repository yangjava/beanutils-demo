package com.demo.beanutils;

import org.apache.commons.beanutils.ConvertUtils;

import java.util.Date;

public class ConvertDemo {

    public static void main(String[] args) {
        // 将整型转换成字符串
        Object object = ConvertUtils.convert(123, String.class);
        String typeName = object.getClass().getTypeName();
        System.out.println(typeName);

        // 将日期转换成字符串
        Object object2 = ConvertUtils.convert(new Date(), String.class);
        String typeName2 = object2.getClass().getTypeName();
        System.out.println(typeName2);

        // 将字符串转换成Double
        Object object3 = ConvertUtils.convert("123", Double.class);
        String typeName3 = object3.getClass().getTypeName();
        System.out.println(typeName3);
    }
}
