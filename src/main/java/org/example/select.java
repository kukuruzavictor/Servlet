package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "select", urlPatterns = "/select")
public class select extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String select = request.getParameter("select");
        PrintWriter writer = response.getWriter();
        String html = "<html><body>";
        if(select==null){
            html += "Select any number:<br/>" +
                    "<form name='select' method='get' action ='/select'>" +
                    "<select name='select'>" +
                    "<option value='one'>one</option>" +
                    "<option value='two'>two</option>" +
                    "<option value='three'>three</option>" +
                    "<option value='four'>four</option></select><br/>" +
                    "<input type='submit' value='submit'>" +
                    "</form></body></html>";
        }else{
            html += "You choose number ["+select+"]" +
                    "</body></html>";
        }
        writer.println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
