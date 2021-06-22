import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 * @desc Cooke案例test;
 * @date 2021/06/20/14:10;
 */
public class CookieDemo01 extends HttpServlet {

    public static void main(String[] args) {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        for (Cookie o : cookies) {
            if ("lastLoginTime".equals(o.getName())) {
                Date date = new Date(Long.parseLong(o.getValue()));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                out.write("您访问本站的时间是");
                out.write(sdf.format(date));
            }
        }

        Cookie cookie = new Cookie("lastLoginTime",
                System.currentTimeMillis() + "");
        resp.addCookie(cookie);
        cookie.setMaxAge(0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
