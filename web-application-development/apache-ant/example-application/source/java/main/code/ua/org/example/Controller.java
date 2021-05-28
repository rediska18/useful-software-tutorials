package ua.org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import java.util.Arrays;

/**
 * Created by @AuthorName    Ярослав.
 * File @VersionNumber       1.0.
 * Created on @Date          29.04.2021.
 * Current @ProjectName      "example-application".
 */
@WebServlet(Controller.SERVLET_PATH)
public class Controller extends HttpServlet implements Serializable {

    public static final String SERVLET_PATH = "/servlet";
    public static final long serialVersionUID = 1234567890L;
    private static final Logger LOGGER = LogManager.getLogger(Controller.class);

    @Override
    public void init() throws ServletException {
        LOGGER.info("Web Application Servlet Controller was " +
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
        LOGGER.info("Web Application Servlet Controller was " +
                "successfully destroyed.");
    }

    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        LOGGER.info("doGet request");
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
