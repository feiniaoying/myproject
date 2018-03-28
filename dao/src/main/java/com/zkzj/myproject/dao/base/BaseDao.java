package com.zkzj.myproject.dao.base;/**

/**
 * @description: 基础类
 * @author: chenwt
 * @create: 2018-03-25 23:53
 **/

import java.util.List;

public interface BaseDao<T> {
    public Boolean insert(T var);
    public Boolean delete(T var);
    public Boolean update(T var);
    public List<T> select(T var);
}