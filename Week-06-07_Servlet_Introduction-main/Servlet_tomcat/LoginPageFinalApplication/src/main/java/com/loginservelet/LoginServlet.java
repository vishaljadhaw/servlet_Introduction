package com.loginservelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Regular expressions for validation
        String usernameRegex = "^[A-Z][a-zA-Z0-9]{2,}$"; // Starts with uppercase, min 3 chars
        String passwordRegex = "^(?=.*[A-Z])(?=.*[!@#$%^&*()_+{}\\[\\]:;<>,.?/~`])(?=.*\\d).{8,}$"; // Min 8 chars, 1 uppercase, 1 special, 1 number

        if (!Pattern.matches(usernameRegex, username) || !Pattern.matches(passwordRegex, password)) {
            response.sendRedirect("error.jsp"); // Redirect to error page
            return;
        }

        // Hardcoded credentials (Replace with DB check)
        if ("Admin".equals(username) && "Test@1234".equals(password)) {
            response.sendRedirect("success.jsp"); // Redirect to success page
        } else {
            response.sendRedirect("error.jsp"); // Redirect to error page
        }
    }
}
