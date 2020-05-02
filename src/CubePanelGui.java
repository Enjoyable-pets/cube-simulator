import Cube.*;
import Panels.BottomButtonsPanel;
import Panels.LeftButtonsPanel;
import Panels.RightButtonsPanel;
import Panels.TopButtonsPanel;
import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubePanelGui implements ActionListener {
    JFrame frame;
    Cube cube;

    public static void main(String[] args) throws InterruptedException {

        CubePanelGui gui = new CubePanelGui();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cube = new Cube(100);
        DrawCubePanel drawPanel = new DrawCubePanel(cube);


        LeftButtonsPanel leftButtonsPanel = new LeftButtonsPanel();
        TopButtonsPanel topButtonsPanel = new TopButtonsPanel();
        BottomButtonsPanel bottomButtonsPanel = new BottomButtonsPanel();
        RightButtonsPanel rightButtonsPanel = new RightButtonsPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, leftButtonsPanel);
        frame.getContentPane().add(BorderLayout.NORTH, topButtonsPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, bottomButtonsPanel);
        frame.getContentPane().add(BorderLayout.EAST, rightButtonsPanel);

        frame.setSize(CubeSize.fullWidth, CubeSize.fullHeight);
        frame.setResizable(false);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Face faceTemp = cube.getFace(Side.FRONT, 0, 0);
        Face face = cube.getFace(Side.TOP, 0, 1);
        cube.setFace(face, Side.FRONT, 0, 0);
        cube.setFace(faceTemp, Side.TOP, 0, 1);

        frame.repaint();
    }
}
