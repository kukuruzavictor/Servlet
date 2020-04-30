package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "textarea", urlPatterns = "feedback")
public class textarea extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String feedback = request.getParameter("feedback");
        PrintWriter writer = response.getWriter();
        String html = "<html><body>";
        if (feedback==null){
            html += "Leave feedback:<br/>" +
                    "<form name='feedback' action='feedback' method='get'>" +
                    "<textarea rows='5' cols='30' name='feedback'></textarea><br/>" +
                    "<input type='submit' value='submit'>" +
                    "</form>";
        }else{
            html += "Your feedback:<br/><i>"+feedback+"</i>" +
                    "</body></html>";
        }
        writer.println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
