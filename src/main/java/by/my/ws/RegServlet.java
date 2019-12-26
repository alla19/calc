package by.my.ws;

import by.my.ws.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(urlPatterns = "/reg",name = "RegServlet")
public class RegServlet extends HttpServlet {


    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String age = req.getParameter("age");
        String pass = req.getParameter("pass");

        User user = new User (name,login,Integer.parseInt(age),pass);

        if (getServletContext().getAttribute("userList")==null){
            getServletContext().setAttribute("userList",new ArrayList<User>());
        }

        List<User>userList= (List<User>) getServletContext().getAttribute("userList");
        userList.add(user);
    }
}

