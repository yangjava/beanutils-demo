package com.demo.beanutils;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class User {

    private Long id;

    private String name;

    private Integer age;

    private List<UserForm> userForms;

}
