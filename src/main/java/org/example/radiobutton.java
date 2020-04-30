package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "radiobutton", urlPatterns = "radiobutton")
public class radiobutton extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gender = request.getParameter("gender");
        PrintWriter writer = response.getWriter();
        String html = "<html><body>";
        if(gender==null) {
            html += "Your gender:<br/>" +
                    "<form name='radiobutton' method='get' action='radiobutton'>" +
                    "<input type='radio' name='gender' value='Male'>Male<br/>" +
                    "<input type='radio' name='gender' value='Female'>Female<p/>" +
                    "<input type='submit' value='submit'>" +
                    "</form></body></html>";
        } else {
            html += "Your gender is <b>"+gender+"</b>" +
                    "</body></html>";
        }
        writer.println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
