package com.chengliang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 可以导入父项目的jar包

/**
 * HttpServlet是一个抽象类，其中有doGet、doPost、doPut等方法，用到哪些就复写哪些方法
 *
 * 又由于Post和Get方法本质上是相同的，只是性质不同，所以可以只实现一个方法，另一个方法直接调用该方法
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("Hello Servlet!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
