package com.hj.studentcc.dao.impl;

import com.hj.studentcc.dao.IStudentDao;
import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.ViewCourseAndTeacher;
import com.hj.studentcc.util.TxDBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 16:38
 * @Description:
 */
public class StudentDao implements IStudentDao {
    @Override
    public List<ViewCourseAndTeacher> findAllNo(Integer id) {
        String sql = "select * from ct where c_id <>?";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.query(sql, new BeanListHandler<ViewCourseAndTeacher>(ViewCourseAndTeacher.class), id, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewCourseAndTeacher> findHave(Integer id) {
        String sql = "select * from course_teacher where s_id =?";
        return getViewCourseAndTeachers(id, sql);
    }

    @Override
    public void tuike(Integer id, Integer s_id) {
        String sql = "delete from class_stu_rela where cla_id=? and stu_id=?";
        String sql2 = "update classno set cla_num=cla_num-1 where c_id=?";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            runner.update(sql, id, s_id);
            runner.update(sql2, s_id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void chooseCourse(Integer id, Integer s_id) {
        String sql1 = "insert into class_stu_rela values(null,?,?)";
        String sql2 = "update classno set cla_num=cla_num+1 where c_id=?";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            runner.update(sql1, id, s_id);
            runner.update(sql2, s_id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Integer findNum(Integer id) {
        String sql = "select cla_num from classno where c_id =?";

        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.query(sql, new ScalarHandler<Integer>(), id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer update(Student student) {
        String sql = "update student set s_name=? , s_gender=?,s_age=? where u_id=?";
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.update(sql, student.getS_name(), student.getS_gender(), student.getS_age(), student.getU_id());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    /**
     * 方法的复用<br>
     * 查询课程信息
     *
     * @param id
     * @param sql
     * @return
     */
    private List<ViewCourseAndTeacher> getViewCourseAndTeachers(Integer id, String sql) {
        try {
            QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
            return runner.query(sql, new BeanListHandler<ViewCourseAndTeacher>(ViewCourseAndTeacher.class), id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
