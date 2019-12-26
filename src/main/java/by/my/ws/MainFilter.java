package by.my.ws;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "MainFilter", servletNames = {"RegServlet", "MainServlet"})
public class MainFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        by.my.ws.entity.User currentUser = (by.my.ws.entity.User) req.getSession().getAttribute("currentUser");
        if (currentUser.getName().equals("ADMIN")){
            chain.doFilter(req, res);
        } else res.sendRedirect("/main");
    }
}



