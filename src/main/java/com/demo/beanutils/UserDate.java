package com.demo.beanutils;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class UserDate {

    private Long id;

    private String name;

    private Integer age;

    private Date birthDay;

}
