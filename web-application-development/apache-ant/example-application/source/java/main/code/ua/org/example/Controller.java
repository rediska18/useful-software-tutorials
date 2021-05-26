package ua.org.example;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * Created by @AuthorName    Ярослав.
 * File @VersionNumber       1.0.
 * Created on @Date          29.04.2021.
 * Current @ProjectName      "example-application".
 */
@WebServlet(Controller.APPLICATION_PATH)
public class Controller extends HttpServlet implements Serializable   {
    public static final long serialVersionUID = 42L;

    public static final String APPLICATION_PATH = "/api/v1";

    @Override
    public void init() throws ServletException {
        System.out.println("Web Application Servlet Controller was " +
                "successfully initialised.");
    }

    /*
    @Override
    public void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException {
        System.out.println("Web Application Servlet Controller was " +
                "successfully initialised.");
    }*/

    @Override
    public void destroy() {
        System.out.println("Web Application Servlet Controller was " +
                "successfully destroyed.");
    }


    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        //httpServletResponse.setContentType(new MimeType());
        httpServletResponse.setContentType("text/html");
        httpServletResponse.setCharacterEncoding("UTF-8");
        final PrintWriter printWriter = httpServletResponse.getWriter();
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>").append(System.lineSeparator())
                .append("<head>").append(System.lineSeparator())
                .append("<title>Hello World!</title>").append(System.lineSeparator())
                .append("/<head>").append(System.lineSeparator())
                .append("<body>").append(System.lineSeparator())
                .append("<h1>Hello World!</h1>").append(System.lineSeparator())
                .append("</body>").append(System.lineSeparator())
                .append("<html>");
        printWriter.println(stringBuilder);
    }
}
