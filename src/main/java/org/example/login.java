package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", urlPatterns = "/login")
public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        String html ="<html><body>";
            html+=  "<form method='post' name='login' action='/login'>" +
                    "Username: <input type='text' name='username'/> <br/>" +
                    "Password: <input type='password' name='password'/> <p/>" +
                    "<input type='submit' value='login'>" +
                    "</form></body></html>";
        writer.println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        String html ="<html><body>";
        html+=  "Your username is: <b>"+username+"</b><br/>" +
                "Your password is: <b>"+password+"</b>" +
                "</body></html>";
        writer.println(html);
    }
}
