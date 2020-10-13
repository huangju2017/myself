package com.hj.studentcc.service;

import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.User;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 11:16
 * @Description:
 */
public interface IUserService {

    /**
     * 注册用户
     */
    Integer register(User user);

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 查询学生用户具体信息
     *
     * @param id
     * @return
     */
    Student messageS(Integer id);

    /**
     * 查询教师用户具体信息
     *
     * @param id
     * @return
     */
    Teacher messageT(Integer id);

    /**
     * 完善学生用户具体信息
     * @param student
     * @return
     */
    Integer addStudent(Student student);

    /**
     * 完善教师用户具体信息
     * @param teacher
     * @return
     */
    Integer addTeacher(Teacher teacher);

    /**
     * 根据id修改密码
     * @param id
     * @param password
     * @return
     */
    User xiugai(Integer id, String password);
}
