package com.zkzj.myproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: 学生类
 * @author: chenwt
 * @create: 2018-03-25 23:42
 **/
@Setter
@Getter
@ToString
public class Student {
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Boolean sex;
    /**
     * 地址
     */
    private String address;
    /**
     * 相片
     */
    private String photo;
}
