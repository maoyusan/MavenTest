import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author by clam on 2021/6/18.
 */
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = "D:\\GithubProject\\mavenTest\\mavenTest\\response\\target\\classes\\test.txt";
        String filename = realPath.substring(realPath.lastIndexOf("\\") + 1);
        resp.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(filename, "utf-8"));
        FileInputStream fis = new FileInputStream(realPath);
        byte[] bytes = new byte[1024];
        int counter;
        ServletOutputStream sos = resp.getOutputStream();
        while ((counter = fis.read(bytes)) != -1) {
            sos.write(bytes, 0, counter);
        }
        fis.close();
        sos.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
