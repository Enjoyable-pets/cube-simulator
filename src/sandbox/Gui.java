import Cube.Cube;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Cube cube = new Cube(100);
        frame.getContentPane().add(BorderLayout.CENTER, new DrawCubePanel(cube));
        frame.getContentPane().add(BorderLayout.WEST, new Gui());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);
        frame.setVisible(true);
    }

    public Gui() {

        JButton button1 = new JButton("->");
        JButton button2 = new JButton("->");
        int insetSize = 35;
        Insets buttonInsets = new Insets(insetSize, insetSize, insetSize, insetSize);
        button1.setMargin(buttonInsets);
        button2.setMargin(buttonInsets);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Component emptyBox = Box.createRigidArea(new Dimension(30, 215));
        Component padding = Box.createRigidArea(new Dimension(30, 5));

        add(emptyBox);
        add(button1);
        add(padding);
        add(button2);

        button1.setBounds(20, 20, 90, 90);
        button2.setBounds(20, 120, 90, 90);

    }
}
