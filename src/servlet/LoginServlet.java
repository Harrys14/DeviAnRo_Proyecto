package servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String correo = request.getParameter("correo");
        String password = request.getParameter("password");

        UsuarioDAO dao = new UsuarioDAO();

        if (dao.login(correo, password)) {
            response.sendRedirect("home.html");
        } else {
            response.sendRedirect("index.html");
        }
    }
}