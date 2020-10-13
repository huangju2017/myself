package com.hj.studentcc.pojo;

import java.util.Objects;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 20:38
 * @Description:
 */
public class TeacherXuan {

    private Integer c_id;
    private String c_name;
    private String cla_name;
    private String c_info;
    private Integer t_id;

    public TeacherXuan(Integer c_id, String c_name, String cla_name, String c_info, Integer t_id) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.cla_name = cla_name;
        this.c_info = c_info;
        this.t_id = t_id;
    }


    public TeacherXuan() {
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
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

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherXuan that = (TeacherXuan) o;
        return Objects.equals(c_id, that.c_id) &&
                Objects.equals(c_name, that.c_name) &&
                Objects.equals(cla_name, that.cla_name) &&
                Objects.equals(c_info, that.c_info) &&
                Objects.equals(t_id, that.t_id);
    }

    public TeacherXuan(Integer c_id, String c_name, String cla_name, String c_info) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.cla_name = cla_name;
        this.c_info = c_info;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_id, c_name, cla_name, c_info, t_id);
    }

    @Override
    public String toString() {
        return "TeacherXuan{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", cla_name='" + cla_name + '\'' +
                ", c_info='" + c_info + '\'' +
                ", t_id=" + t_id +
                '}';
    }
}
