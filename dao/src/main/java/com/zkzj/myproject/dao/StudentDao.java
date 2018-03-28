package com.zkzj.myproject.dao;/**
 * Created with IntelliJ IDEA.
 * ProjectName:myproject
 * Description:
 * User: chenwt
 * Date: 2018-03-25:23:52
 */

import com.zkzj.myproject.dao.base.BaseDao;
import com.zkzj.myproject.model.Student;
import org.springframework.stereotype.Repository;

/**
 * @description: dao类
 * @author: chenwt
 * @create: 2018-03-25 23:52
 **/
@Repository
public interface StudentDao extends BaseDao<Student> {
}
