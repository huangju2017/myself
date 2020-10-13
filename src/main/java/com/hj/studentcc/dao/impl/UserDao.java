package com.hj.studentcc.dao.impl;

import com.hj.studentcc.dao.IUserDao;
import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.User;
import com.hj.studentcc.util.TxDBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 11:19
 * @Description:
 */
public class UserDao implements IUserDao {

    @Override
    public Integer register(User user) {

        String sql = "insert into user values(null,?,?,?)";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.update(sql, user.getUsername(), user.getPassword(), user.getStatus());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public User login(User user) {

        String sql = "select * from user where username =? and password =? and status=?";


        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword(), user.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student messageS(Integer id) {
        String sql = "select * from student where u_id=?";

        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.query(sql, new BeanHandler<Student>(Student.class), id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Teacher messageT(Integer id) {
        String sql = "select * from teacher where u_id=?";

        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.query(sql, new BeanHandler<Teacher>(Teacher.class), id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer addStudent(Student student) {

        String sql = "insert into student values(null,?,?,?,?)";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.update(sql, student.getS_name(), student.getS_gender(), student.getS_age(), student.getU_id());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer addTeacher(Teacher teacher) {

        String sql = "insert into teacher values(null,?,?,?,?)";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.update(sql, teacher.getT_name(), teacher.getT_gender(), teacher.getT_age(), teacher.getU_id());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public User xiugai(Integer id, String password) {

        String sql1 = "update user set password =? where id=?";
        String sql2 = "select * from user where id=?";

        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            int line = runner.update(sql1, password, id);
            if (line > 0) {
                return runner.query(sql2, new BeanHandler<User>(User.class), id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
