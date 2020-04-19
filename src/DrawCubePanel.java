import Settings.CubeColor;
import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;

public class DrawCubePanel extends JPanel {
    Graphics graphics;
    CubeSize cubeSize;
    int size, c0, c1, c2, c3, c4, c5, c6, c7;

    public DrawCubePanel() {
        cubeSize = new CubeSize();
        size = cubeSize.getTileSize();
        c0 = cubeSize.getC0();
        c1 = cubeSize.getC1();
        c2 = cubeSize.getC2();
        c3 = cubeSize.getC3();
        c4 = cubeSize.getC4();
        c5 = cubeSize.getC5();
        c6 = cubeSize.getC6();
        c7 = cubeSize.getC7();
    }

    public void paintComponent(Graphics graphics) {
        this.graphics = graphics;
        paintTopSide();
        paintLeftSide();
        paintCenterSide();
        paintRightSide();
        paintBottomSide();
        paintBackSide();
    }

    private void paintTopSide() {
        graphics.setColor(CubeColor.yellow);
        graphics.fill3DRect(c2, c0, size, size, true);
        graphics.fill3DRect(c3, c0, size, size, true);
        graphics.fill3DRect(c2, c1, size, size, true);
        graphics.fill3DRect(c3, c1, size, size, true);
    }

    private void paintLeftSide() {
        graphics.setColor(CubeColor.red);
        graphics.fill3DRect(c0, c2, size, size, true);
        graphics.fill3DRect(c1, c2, size, size, true);
        graphics.fill3DRect(c0, c3, size, size, true);
        graphics.fill3DRect(c1, c3, size, size, true);
    }

    private void paintCenterSide() {
        graphics.setColor(CubeColor.green);
        graphics.fill3DRect(c2, c2, size, size, true);
        graphics.fill3DRect(c2, c3, size, size, true);
        graphics.fill3DRect(c3, c2, size, size, true);
        graphics.fill3DRect(c3, c3, size, size, true);
    }

    private void paintRightSide() {
        graphics.setColor(CubeColor.orange);
        graphics.fill3DRect(c4, c2, size, size, true);
        graphics.fill3DRect(c4, c3, size, size, true);
        graphics.fill3DRect(c5, c2, size, size, true);
        graphics.fill3DRect(c5, c3, size, size, true);
    }

    private void paintBottomSide() {
        graphics.setColor(CubeColor.white);
        graphics.fill3DRect(c2, c4, size, size, true);
        graphics.fill3DRect(c2, c5, size, size, true);
        graphics.fill3DRect(c3, c4, size, size, true);
        graphics.fill3DRect(c3, c5, size, size, true);
    }

    private void paintBackSide() {
        graphics.setColor(CubeColor.blue);
        graphics.fill3DRect(c6, c2, size, size, true);
        graphics.fill3DRect(c6, c3, size, size, true);
        graphics.fill3DRect(c7, c2, size, size, true);
        graphics.fill3DRect(c7, c3, size, size, true);
    }
}
