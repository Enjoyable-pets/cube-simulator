import Cube.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    int size = 75;
    Cube cube;

    public DrawPanel() {
        cube = new Cube(size);
    }

    public void paintComponent(Graphics graphics) {

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
        graphics.setColor(cube.getColor(Side.TOP, 0, 0));
        graphics.fill3DRect(c2, c0, size, size, true);

        graphics.setColor(cube.getColor(Side.TOP, 0, 1));
        graphics.fill3DRect(c2, c1, size, size, true);

        graphics.setColor(cube.getColor(Side.TOP, 1, 0));
        graphics.fill3DRect(c3, c0, size, size, true);

        graphics.setColor(cube.getColor(Side.TOP, 1, 1));
        graphics.fill3DRect(c3, c1, size, size, true);

//      Left

        graphics.setColor(cube.getColor(Side.LEFT, 0, 0));
        graphics.fill3DRect(c0, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.LEFT, 0, 1));
        graphics.fill3DRect(c0, c3, size, size, true);
        graphics.setColor(cube.getColor(Side.LEFT, 1, 0));
        graphics.fill3DRect(c1, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.LEFT, 1, 1));
        graphics.fill3DRect(c1, c3, size, size, true);

//      Center

        graphics.setColor(cube.getColor(Side.FRONT, 0, 0));
        graphics.fill3DRect(c2, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.FRONT, 0, 1));
        graphics.fill3DRect(c2, c3, size, size, true);
        graphics.setColor(cube.getColor(Side.FRONT, 1, 0));
        graphics.fill3DRect(c3, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.FRONT, 1, 1));
        graphics.fill3DRect(c3, c3, size, size, true);

//      Right

        graphics.setColor(cube.getColor(Side.RIGHT, 0, 0));
        graphics.fill3DRect(c4, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.RIGHT, 0, 1));
        graphics.fill3DRect(c4, c3, size, size, true);
        graphics.setColor(cube.getColor(Side.RIGHT, 1, 0));
        graphics.fill3DRect(c5, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.RIGHT, 1, 1));
        graphics.fill3DRect(c5, c3, size, size, true);

//      Bottom
        graphics.setColor(cube.getColor(Side.BOTTOM, 0, 0));
        graphics.fill3DRect(c2, c4, size, size, true);
        graphics.setColor(cube.getColor(Side.BOTTOM, 0, 1));
        graphics.fill3DRect(c2, c5, size, size, true);
        graphics.setColor(cube.getColor(Side.BOTTOM, 1, 0));
        graphics.fill3DRect(c3, c4, size, size, true);
        graphics.setColor(cube.getColor(Side.BOTTOM, 1, 1));
        graphics.fill3DRect(c3, c5, size, size, true);

//      Back
        graphics.setColor(cube.getColor(Side.BACK, 0, 0));
        graphics.fill3DRect(c6, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.BACK, 0, 1));
        graphics.fill3DRect(c6, c3, size, size, true);
        graphics.setColor(cube.getColor(Side.BACK, 1, 0));
        graphics.fill3DRect(c7, c2, size, size, true);
        graphics.setColor(cube.getColor(Side.BACK, 1, 1));
        graphics.fill3DRect(c7, c3, size, size, true);
    }
}
