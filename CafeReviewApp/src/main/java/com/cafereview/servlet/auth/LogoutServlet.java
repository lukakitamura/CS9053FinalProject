// LogoutServlet.java
package com.cafereview.servlet.auth;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import jakarta.servlet.ServletException; 

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		        HttpSession session = request.getSession(false);
		        if (session != null) {
		            session.invalidate();
		        }
        response.sendRedirect(request.getContextPath() + "/login");
    }
}
