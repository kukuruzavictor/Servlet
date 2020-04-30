package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="LogInServlet", urlPatterns = "/login2", loadOnStartup = 1)
public class LogInServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String [] language = request.getParameterValues("language");
        String gender = request.getParameter("gender");
        String feedback = request.getParameter("feedback");
        String number = request.getParameter("number");
        PrintWriter writer = response.getWriter();
        String htmlRespone = "<html>";
        htmlRespone += "Your username is: <b>" + username + "</b><br/>";
        htmlRespone += "Your password is: <b>" + password + "</b><p/>";
        if (language!=null){
            htmlRespone+="Languages:<br/>";
            for (String value : language) {
                htmlRespone+="<b>"+value+"</b><br/>";
            }
        }
        if (gender!=null){
            htmlRespone+="</p>Your gender is <b>"+gender+"</b>";
        }
        htmlRespone+="<p/>Your feedback:<br/><i>"+feedback+"</i>";
        htmlRespone+="<p/>Your number is <b>["+number+"]</b></p>";
        htmlRespone+="<a href='/'><< back to login form</a>";
        htmlRespone += "</html>";

        writer.println(htmlRespone);
    }

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{

    }
}