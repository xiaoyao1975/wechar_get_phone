package com.itany.servlt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        req.setCharacterEncoding("utf8");
        String sql=req.getParameter("sql");
        HttpSession session = req.getSession();
        session.setAttribute("usr","hello 你好");
        //System.out.println(sql);
        PrintWriter pr=resp.getWriter();
        pr.println("sql");
        //将页面转发到欢迎页面
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome.jsp");
        //requestDispatcher.forward(req,resp);
    }

}
