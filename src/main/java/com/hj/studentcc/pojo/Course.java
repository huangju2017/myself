package com.hj.studentcc.pojo;

import java.util.Objects;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 16:44
 * @Description:
 */
public class Course {

    private Integer c_id;
    private String c_name;
    private String c_info;

    public Course() {
    }

    public Course(Integer c_id, String c_name, String c_info) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_info = c_info;
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

    public String getC_info() {
        return c_info;
    }

    public void setC_info(String c_info) {
        this.c_info = c_info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(c_id, course.c_id) &&
                Objects.equals(c_name, course.c_name) &&
                Objects.equals(c_info, course.c_info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_id, c_name, c_info);
    }

    @Override
    public String toString() {
        return "course{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_info='" + c_info + '\'' +
                '}';
    }
}
