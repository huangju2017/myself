package com.hj.studentcc.dao;

import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.TeacherXuan;

import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 20:37
 * @Description:
 */
public interface ITeacherDao {
    List<TeacherXuan> findAll(Integer t_id);

    List<TeacherXuan> findNo();

    void cancel(Integer id);

    void choose(Integer id, Integer t_id);

    Integer update(Teacher teacher);
}
