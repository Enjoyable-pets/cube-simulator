import Cube.*;
import Panels.*;
import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubeSimulator {
    JFrame frame;
    Cube cube;

    public static void main(String[] args) {

        CubeSimulator gui = new CubeSimulator();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cube = new Cube(100);
        DrawCubePanel drawPanel = new DrawCubePanel(cube);

        JPanel leftButtonsPanel = createLeftButtonsPanel();
        JPanel topButtonsPanel = createTopButtonsPanel();
        JPanel bottomButtonsPanel = createBottomButtonsPanel();
        JPanel rightButtonsPanel = createRightButtonsPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, leftButtonsPanel);
        frame.getContentPane().add(BorderLayout.NORTH, topButtonsPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, bottomButtonsPanel);
        frame.getContentPane().add(BorderLayout.EAST, rightButtonsPanel);

        frame.setSize(CubeSize.fullWidth, CubeSize.fullHeight);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private JPanel createLeftButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        Component emptyBox = Box.createRigidArea(new Dimension(0, cubeSize.getC2()));
        Component padding = Box.createRigidArea(new Dimension(cubeSize.getPadding(), cubeSize.getPadding()));
        CubeButton button1 = new CubeButton();
        CubeButton button2 = new CubeButton();

        button1.addActionListener(new LeftTopRightButtonListener());
        button2.addActionListener(new LeftBottomRightButtonListener());

        panel.add(emptyBox);
        panel.add(button1);
        panel.add(padding);
        panel.add(button2);

        return panel;
    }

    private JPanel createTopButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        CubeButton button1 = new CubeButton();
        CubeButton button2 = new CubeButton();

        button1.addActionListener(new TopLeftDownButtonListener());
        button2.addActionListener(new TopRightDownButtonListener());

        Component emptyBox = Box.createRigidArea(new Dimension(cubeSize.getC3()-3, 0));
        Component padding = Box.createRigidArea(new Dimension(cubeSize.getPadding(), cubeSize.getPadding()));

        panel.add(emptyBox);
        panel.add(button1);
        panel.add(padding);
        panel.add(button2);

        return panel;
    }

    private JPanel createBottomButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        CubeButton button1 = new CubeButton();
        CubeButton button2 = new CubeButton();

        button1.addActionListener(new BottomLeftUpButtonListener());
        button2.addActionListener(new BottomRightUpButtonListener());

        Component emptyBox = Box.createRigidArea(new Dimension(cubeSize.getC3()-3, 0));
        Component padding = Box.createRigidArea(new Dimension(cubeSize.getPadding(), cubeSize.getPadding()));

        panel.add(emptyBox);
        panel.add(button1);
        panel.add(padding);
        panel.add(button2);

        return panel;
    }

    private JPanel createRightButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        CubeSize cubeSize = new CubeSize();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        Component emptyBox = Box.createRigidArea(new Dimension(0, cubeSize.getC2()));
        Component padding = Box.createRigidArea(new Dimension(cubeSize.getPadding(), cubeSize.getPadding()));
        CubeButton button1 = new CubeButton();
        CubeButton button2 = new CubeButton();

        button1.addActionListener(new RightTopLeftButtonListener());
        button2.addActionListener(new RightBottomLeftButtonListener());

        panel.add(emptyBox);
        panel.add(button1);
        panel.add(padding);
        panel.add(button2);

        return panel;
    }

    private class LeftTopRightButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.TOP, Way.RIGHT);
            frame.repaint();
        }
    }

    private class LeftBottomRightButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.BOTTOM, Way.RIGHT);
            frame.repaint();
        }
    }

    private class TopLeftDownButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.LEFT, Way.DOWN);
            frame.repaint();
        }
    }

    private class TopRightDownButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.RIGHT, Way.DOWN);
            frame.repaint();
        }
    }

    private class BottomLeftUpButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.LEFT, Way.UP);
            frame.repaint();
        }
    }

    private class BottomRightUpButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.RIGHT, Way.UP);
            frame.repaint();
        }
    }

    private class RightTopLeftButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.TOP, Way.LEFT);
            frame.repaint();
        }
    }

    private class RightBottomLeftButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            cube.move(Side.BOTTOM, Way.LEFT);
            frame.repaint();
        }
    }
}
