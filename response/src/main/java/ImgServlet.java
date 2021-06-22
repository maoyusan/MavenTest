import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author Administrator;
 * @desc 创建图片案例;
 * @date 2021/06/18/22:28;
 */
public class ImgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("refresh", "3");
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        Graphics g = (Graphics2D) image.getGraphics();
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 50, 20);
        g.setColor(Color.black);
        g.setFont(new Font(null, Font.BOLD, 20));
        g.drawString(magnum(), 0, 20);
        resp.setContentType("image/jpeg");
        /*不让浏览器缓存*/
        resp.setDateHeader("expires", -1);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-cache");
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }

    private String magnum() {
        Random r = new Random();
        String num = r.nextInt(9999) + "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4 - num.length(); i++) {
            sb.append("0");
        }
        num = sb.toString() + num;
        return num;
    }

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
