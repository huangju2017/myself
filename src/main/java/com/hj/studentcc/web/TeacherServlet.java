package com.hj.studentcc.web;

import com.hj.studentcc.pojo.*;
import com.hj.studentcc.service.impl.StudentService;
import com.hj.studentcc.service.impl.TeacherService;
import com.hj.studentcc.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 15:54
 * @Description:
 */
@WebServlet("/teacherServlet")
public class TeacherServlet extends HttpServlet {

    /**
     * 空参构造方法
     */
    public TeacherServlet() {
    }

    private String encoding;

    @Override
    public void init() throws ServletException {
        encoding = super.getServletContext().getInitParameter("encoding");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding(encoding);
        resp.setCharacterEncoding(encoding);
        resp.setContentType("text/hmtl;charset=" + encoding);

        String cmd = req.getParameter("cmd");
        if ("findAll".equals(cmd)) {
            findAll(req, resp);
        } else if ("findNo".equals(cmd)) {
            findNo(req, resp);
        } else if ("cancel".equals(cmd)) {
            cancel(req, resp);
        } else if ("choose".equals(cmd)) {
            choose(req, resp);
        } else if ("findById".equals(cmd)) {
            findById(req, resp);
        } else if ("update".equals(cmd)) {
            update(req, resp);
        }


    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer u_id = Integer.valueOf(req.getParameter("id"));
        String t_name = req.getParameter("name");
        String t_gender = req.getParameter("gender");
        Integer t_age = Integer.valueOf(req.getParameter("age"));

        TeacherService service = new TeacherService();
        Teacher teacher = new Teacher(null, t_name, t_gender, t_age, u_id);
        Integer line = service.update(teacher);
        if (line > 0) {
            findById(req, resp);
        }
    }

    /**
     * 根据id回显个人信息
     *
     * @param req
     * @param resp
     */
    private void findById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserServlet servlet = new UserServlet();
        servlet.teacherMessage(req, resp);

        /**
         * 重定向到主页
         */
        resp.sendRedirect(req.getContextPath() + "/tea-show.jsp");
    }

    /**
     * 根据课程id和教师id
     * 为老师添加授课
     *
     * @param req
     * @param resp
     */
    private void choose(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));
        Teacher teacher = (Teacher) req.getSession().getAttribute("teacher");
        TeacherService service = new TeacherService();
        List<TeacherXuan> xuanke = service.findAll(teacher.getT_id());
        if (xuanke.size()==0) {
            service.choose(id, teacher.getT_id());
            findAll(req, resp);
        } else {
            req.setAttribute("teacher_msg", "<script>alert('您已经有课程，不能再选课了！');</script>");
            findNo(req, resp);
        }

    }

    /**
     * 根据id取消课程
     *
     * @param req
     * @param resp
     */
    private void cancel(HttpServletRequest req, HttpServletResponse resp) {
        Integer id = Integer.valueOf(req.getParameter("id"));

        TeacherService service = new TeacherService();

        service.cancel(id);

    }


    /**
     * 查看没有老师的课程
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void findNo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Teacher teacher = (Teacher) req.getSession().getAttribute("teacher");
        TeacherService service = new TeacherService();
        List<TeacherXuan> noXuan = service.findNo();
        req.setAttribute("noXuan", noXuan);
        req.getRequestDispatcher("/tea-noselected.jsp").forward(req, resp);
    }

    /**
     * 查看自己选择的课程
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Teacher teacher = (Teacher) req.getSession().getAttribute("teacher");
        TeacherService service = new TeacherService();
        List<TeacherXuan> xuanke = service.findAll(teacher.getT_id());
        req.setAttribute("xuan", xuanke);
        req.getRequestDispatcher("/tea-selected.jsp").forward(req, resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
