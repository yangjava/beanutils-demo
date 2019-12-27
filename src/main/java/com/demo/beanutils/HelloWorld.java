package com.demo.beanutils;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;

import java.util.*;

public class HelloWorld {


    public static void main(String[] args) throws Exception {
        //同类之间不同对象要求进行数据复制
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAge(18);
        User user2 = new User();
        BeanUtils.copyProperties(user2, user1);
        System.out.println(user2.toString());

        //不同类不同对象之间的数据复制
        UserForm userForm = new UserForm();
        BeanUtils.copyProperties(userForm, user1);
        System.out.println(userForm.toString());

        // 将对象转换为Map
        Map map = BeanUtils.describe(user1);
        System.out.println(map);

        // 将Map转换为对象
        User userInfo = new User();
        BeanUtils.populate(userInfo, map);
        System.out.println(userInfo);

        //拷贝指定属性
        User user3 = new User();
        BeanUtils.copyProperty(user3, "name", "李四");
        System.out.println(user3);

        //设置指定的属性
        User user4 = new User();
        BeanUtils.setProperty(user4, "name", "王五");
        System.out.println(user4);

        //克隆对象
        Object object = BeanUtils.cloneBean(user1);
        System.out.println(object);

        //获取List中的对象
        List<UserForm> list = new ArrayList<>();
        list.add(userForm);
        user1.setUserForms(list);
        BeanUtils.getProperty(user1, "userForms[0].name");
        System.out.println("获取List中的对象==>" + BeanUtils.getProperty(user1, "userForms[0].name"));


        // 获取集合
        String userForms0 = BeanUtils.getIndexedProperty(user1, "userForms", 0);
        String userForm0 = BeanUtils.getIndexedProperty(user1, "userForms[0]");
        System.out.println("userForms0==>"+userForms0);
        System.out.println("userForm0==>"+userForm0);


    }

}
