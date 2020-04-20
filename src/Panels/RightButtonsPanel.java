package Panels;

import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;

public class RightButtonsPanel extends JPanel {
    public RightButtonsPanel() {
        setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Component emptyBox = Box.createRigidArea(new Dimension(0, cubeSize.getC2()));
        Component padding = Box.createRigidArea(new Dimension(cubeSize.getPadding(), cubeSize.getPadding()));
        CubeButton button1 = new CubeButton();
        CubeButton button2 = new CubeButton();

        add(emptyBox);
        add(button1);
        add(padding);
        add(button2);
    }
}
