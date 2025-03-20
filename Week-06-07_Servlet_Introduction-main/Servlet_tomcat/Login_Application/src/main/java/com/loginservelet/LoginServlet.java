package com.loginservelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.regex.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Regex pattern: Starts with a capital letter and has at least 3 characters
        String usernamePattern = "^[A-Z][a-zA-Z0-9]{2,}$";

        if (!username.matches(usernamePattern)) {
            out.println("Invalid username. It must start with a capital letter and be at least 3 characters long.");
            return;
        }

        // Hardcoded credentials (Replace with database in real projects)
        if ("Admin".equals(username) && "1234".equals(password)) {
            response.sendRedirect("success.jsp"); // Redirect to success page
        } else {
            response.sendRedirect("error.jsp"); // Redirect to error page
        }
    }
}

