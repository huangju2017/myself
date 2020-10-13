package com.hj.studentcc.service.impl;

import com.hj.studentcc.dao.IUserDao;
import com.hj.studentcc.dao.impl.UserDao;
import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.User;
import com.hj.studentcc.service.IUserService;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 11:20
 * @Description:
 */
public class UserService implements IUserService {

    IUserDao dao = new UserDao();

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @Override
    public Integer register(User user) {
        return dao.register(user);
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        return dao.login(user);
    }

    /**
     * 查看学生账号是否有个人信息
     *
     * @param id
     * @return
     */
    @Override
    public Student messageS(Integer id) {
        return dao.messageS(id);
    }

    /**
     * 查看教师账号是否有个人信息
     *
     * @param id
     * @return
     */
    @Override
    public Teacher messageT(Integer id) {
        return dao.messageT(id);
    }

    /**
     * 添加自己学生账号的信息
     *
     * @param student
     * @return
     */
    @Override
    public Integer addStudent(Student student) {
        return dao.addStudent(student);
    }

    /**
     * 添加自己教师账号的信息
     *
     * @param teacher
     * @return
     */
    @Override
    public Integer addTeacher(Teacher teacher) {
        return dao.addTeacher(teacher);
    }

    /**
     * 修改密码
     *
     * @param id
     * @param password
     * @return
     */
    @Override
    public User xiugai(Integer id, String password) {
        return dao.xiugai(id, password);
    }


}
