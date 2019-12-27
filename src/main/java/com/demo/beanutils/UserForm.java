package com.demo.beanutils;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class UserForm {

    private Long id;

    private String name;

    private String desc;
}
