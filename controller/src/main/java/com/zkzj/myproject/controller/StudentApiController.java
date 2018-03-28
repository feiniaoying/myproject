package com.zkzj.myproject.controller;

import com.zkzj.myproject.model.Student;
import com.zkzj.myproject.model.utils.ResultVo;
import com.zkzj.myproject.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description: api controller
 * @author: chenwt
 * @create: 2018-03-26 00:04
 **/
@Controller
@RequestMapping("/api/")
public class StudentApiController {
    @Resource
    private StudentService studentService;


    @RequestMapping("findAllStudentInfo")
    @ResponseBody
    public ResultVo findAllStudentInfo (@RequestParam("id") String id){
        Student student=new Student();
        //不做过多验证判断
        if ("0".equals(id)){student=null;}
        else {student.setId(new Integer(id));}
        return studentService.findAllStudent(student);
    }
}