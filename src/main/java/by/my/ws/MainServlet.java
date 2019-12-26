package by.my.ws;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/calc")
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        if (getServletContext().getAttribute("history") == null) {
            getServletContext().setAttribute("history", new ArrayList<>());
        }

        List<String> history = (List<String>) req.getServletContext().getAttribute("history");


        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");
        switch (operation) {
            case "sum":
                int sum = sum(num1, num2);
                history.add("Result " + sum);
                req.setAttribute("result", sum);
                req.getRequestDispatcher("/calculation.jsp").forward(req, resp);
                return;
            case "sub":
                int sub = sub(num1, num2);
                history.add("Result " + sub);
                resp.getWriter().print(sub);
                break;
            case "divide":
                int divide = divide(num1, num2);
                history.add("Result " + divide);
                resp.getWriter().print(divide);
                break;
            case "mult":
                int mult = mult(num1, num2);
                history.add("Result " + mult);
                resp.getWriter().print(mult);
                break;
            default:
                break;
        }

    }

    private int mult(int num1, int num2) throws IOException {
        return num1 * num2;
    }

    private int divide(int num1, int num2) throws IOException {
        return num1 / num2;
    }

    private int sub(int num1, int num2) throws IOException {
        return num1 - num2;
    }

    private int sum(int num1, int num2) throws IOException {
        return num1 + num2;
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/calculation.jsp").forward(req, resp);
    }
}