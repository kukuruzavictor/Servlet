package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkbox", urlPatterns = "/checkbox")
public class checkbox extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String [] language = request.getParameterValues("language");
        PrintWriter writer = response.getWriter();
        String html="<html><body>";
        if (language==null){
            html += "<form name='checkbox' method='get' action='checkbox'>" +
                    "<input type='checkbox' name='language' value='English'>English<br/>" +
                    "<input type='checkbox' name='language' value='Spanish'>Spanish<br/>" +
                    "<input type='checkbox' name='language' value='French'>French<p/>" +
                    "<input type='submit' value='choose'>" +
                    "</form></body></html>";
        } else {
            html+="Languages you choose:<br/>";
            for (String lang : language) {
                html+= "<i>"+lang+"</i><br/>";
            }
            html+="</body></html>";
        }
        writer.println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
