package Panels;

import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;

public class BottomButtonsPanel extends JPanel {
    public BottomButtonsPanel() {
        setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        CubeButton button1 = new CubeButton();
        CubeButton button2 = new CubeButton();

        Component emptyBox = Box.createRigidArea(new Dimension(cubeSize.getC3()-3, 0));
        Component padding = Box.createRigidArea(new Dimension(cubeSize.getPadding(), cubeSize.getPadding()));

        add(emptyBox);
        add(button1);
        add(padding);
        add(button2);
    }
}
