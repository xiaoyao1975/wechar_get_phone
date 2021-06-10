package com.itany.servlt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class servletTest extends HttpServlet {

    public void server(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String sql = request.getParameter("sql");
        out.print(sql);
        out.println("this servlet test ");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        server(request,response);
    }
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        server(request,response);
    }

}
