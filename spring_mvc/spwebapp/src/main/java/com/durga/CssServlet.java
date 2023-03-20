package com.durga;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import java.io.*;

public class CssServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/css");
        PrintWriter out = response.getWriter();
        InputStream in = getServletContext().getResourceAsStream("/resources/css/style.css");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = reader.readLine()) != null) {
            out.println(line);
        }
    }
}
