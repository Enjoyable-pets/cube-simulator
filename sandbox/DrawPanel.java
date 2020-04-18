import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics graphics) {
        int size = 75;
        int padding = 5;
        int step = padding + size;
        int c0 = 20;
        int c1 = c0 + step;
        int c2 = c1 + step + padding;
        int c3 = c2 + step;
        int c4 = c3 + step + padding;
        int c5 = c4 + step;
        int c6 = c5 + step + padding;
        int c7 = c6 + step;

//      Top
        graphics.setColor(Color.yellow);
        graphics.fill3DRect(c2, c0, size, size, true);
        graphics.fill3DRect(c3, c0, size, size, true);
        graphics.fill3DRect(c2, c1, size, size, true);
        graphics.fill3DRect(c3, c1, size, size, true);
//      Left
        graphics.setColor(Color.red);
        graphics.fill3DRect(c0, c2, size, size, true);
        graphics.fill3DRect(c1, c2, size, size, true);
        graphics.fill3DRect(c0, c3, size, size, true);
        graphics.fill3DRect(c1, c3, size, size, true);
//      Center
        graphics.setColor(Color.green);
        graphics.fill3DRect(c2, c2, size, size, true);
        graphics.fill3DRect(c2, c3, size, size, true);
        graphics.fill3DRect(c3, c2, size, size, true);
        graphics.fill3DRect(c3, c3, size, size, true);
//      Right
        graphics.setColor(Color.orange);
        graphics.fill3DRect(c4, c2, size, size, true);
        graphics.fill3DRect(c4, c3, size, size, true);
        graphics.fill3DRect(c5, c2, size, size, true);
        graphics.fill3DRect(c5, c3, size, size, true);
//      Bottom
        graphics.setColor(Color.white);
        graphics.fill3DRect(c2, c4, size, size, true);
        graphics.fill3DRect(c2, c5, size, size, true);
        graphics.fill3DRect(c3, c4, size, size, true);
        graphics.fill3DRect(c3, c5, size, size, true);
//      Back
        graphics.setColor(Color.blue);
        graphics.fill3DRect(c6, c2, size, size, true);
        graphics.fill3DRect(c6, c3, size, size, true);
        graphics.fill3DRect(c7, c2, size, size, true);
        graphics.fill3DRect(c7, c3, size, size, true);
    }
}
