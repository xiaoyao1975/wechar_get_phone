package com.itany.servlt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    protected void server(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        req.setCharacterEncoding("utf8");
        String sql=req.getParameter("sql");
        HttpSession session = req.getSession();
        session.setAttribute("usr","hello 你好");
        //System.out.println(sql);
        PrintWriter pr=resp.getWriter();
        pr.println("hello:sql:"+sql);
        //将页面转发到欢迎页面
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome.jsp");
        //requestDispatcher.forward(req,resp);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        server(request,response);
    }
    @Override
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        server(request,response);
    }

}
