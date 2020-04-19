package Panels;

import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;

public class LeftButtonsPanel extends JPanel {
    public LeftButtonsPanel() {
        setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        int insetSize = 42;
        Insets buttonInsets = new Insets(insetSize, insetSize, insetSize, insetSize);
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        button1.setMargin(buttonInsets);
        button2.setMargin(buttonInsets);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Component emptyBox = Box.createRigidArea(new Dimension(insetSize, cubeSize.getC2()));
        Component padding = Box.createRigidArea(new Dimension(insetSize, cubeSize.getPadding()));

        add(emptyBox);
        add(button1);
        add(padding);
        add(button2);

        button1.setBounds(0, 0, cubeSize.getTileSize(), cubeSize.getTileSize());
        button2.setBounds(0, 0, cubeSize.getTileSize(), cubeSize.getTileSize());
    }
}
