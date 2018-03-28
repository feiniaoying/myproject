package com.zkzj.myproject.service;

import com.zkzj.myproject.model.Student;
import com.zkzj.myproject.model.utils.ResultVo;

/**
 * @description: sv类
 * @author: chenwt
 * @create: 2018-03-25 23:57
 **/
public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Boolean addStudent(Student student);

    /**
     * 根据ID删除学生
     * @param id
     * @return
     */
    Boolean deleteStudentById(Integer id);

    /**
     * 根据ID修改学生信息
     * @param student
     * @return
     */
    Boolean updateStudentById(Student student);

    /**
     * 按条件查找所有学生
     * @param student
     * @return
     */
    ResultVo findAllStudent(Student student);

}
