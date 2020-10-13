package com.hj.studentcc.pojo;

import java.util.Objects;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 17:51
 * @Description:
 */
public class ViewCourseAndTeacher {

    //id
    private Integer c_id;
    //课程名
    private String c_name;
    //授课老师姓名
    private String t_name;
    //教室名称
    private String cla_name;
    //课程信息
    private String c_info;
    //选课人数
    private String cla_num;
    //学生id
    private Integer s_id;

    public ViewCourseAndTeacher() {
    }

    public ViewCourseAndTeacher(Integer c_id, String c_name, String t_name, String cla_name, String c_info, String cla_num, Integer s_id) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.t_name = t_name;
        this.cla_name = cla_name;
        this.c_info = c_info;
        this.cla_num = cla_num;
        this.s_id = s_id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getCla_name() {
        return cla_name;
    }

    public void setCla_name(String cla_name) {
        this.cla_name = cla_name;
    }

    public String getC_info() {
        return c_info;
    }

    public void setC_info(String c_info) {
        this.c_info = c_info;
    }

    public String getCla_num() {
        return cla_num;
    }

    public void setCla_num(String cla_num) {
        this.cla_num = cla_num;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewCourseAndTeacher that = (ViewCourseAndTeacher) o;
        return Objects.equals(c_id, that.c_id) &&
                Objects.equals(c_name, that.c_name) &&
                Objects.equals(t_name, that.t_name) &&
                Objects.equals(cla_name, that.cla_name) &&
                Objects.equals(c_info, that.c_info) &&
                Objects.equals(cla_num, that.cla_num) &&
                Objects.equals(s_id, that.s_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_id, c_name, t_name, cla_name, c_info, cla_num, s_id);
    }

    @Override
    public String toString() {
        return "ViewCourseAndTeacher{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", t_name='" + t_name + '\'' +
                ", cla_name='" + cla_name + '\'' +
                ", c_info='" + c_info + '\'' +
                ", cla_num='" + cla_num + '\'' +
                ", cla_id=" + s_id +
                '}';
    }
}
