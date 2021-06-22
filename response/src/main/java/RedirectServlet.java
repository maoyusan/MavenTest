import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Administrator;
 * @desc 重定向;
 * @date 2021/06/19/10:51;
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入了这个请求");
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        String[] hobbies = req.getParameterValues("hobby");
        for (Object o : hobbies) {
            System.out.println(o);
        }
        /*req.getRequestDispatcher("/success.jsp").forward(req, resp);*/
        resp.sendRedirect(req.getContextPath() + "/success.jsp");
        /*第一个请求转发URL不会发生改变，第二个重定向URL会发生改变，第一个叫307，第二个叫305*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
