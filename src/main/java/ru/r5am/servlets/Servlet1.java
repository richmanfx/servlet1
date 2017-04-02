package ru.r5am.servlets;

import org.eclipse.jetty.server.Server;
import ru.r5am.frontend.Frontend;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by Aleksandr Jashhuk (R5AM) on 02.04.2017.
 *
 */

public class Servlet1 {
    public static void main(String[] args) throws Exception{

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        Frontend frontend = new Frontend();
        context.addServlet(new ServletHolder(frontend), "/authform");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
