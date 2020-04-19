import Panels.LeftButtonsPanel;
import Panels.TopButtonsPanel;
import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubePanelGui implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        CubePanelGui gui = new CubePanelGui();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawCubePanel drawPanel = new DrawCubePanel();
        LeftButtonsPanel leftButtonsPanel = new LeftButtonsPanel();
        TopButtonsPanel topButtonsPanel = new TopButtonsPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, leftButtonsPanel);
        frame.getContentPane().add(BorderLayout.NORTH, topButtonsPanel);

        frame.setSize(1400, 800);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        frame.repaint();
    }
}
