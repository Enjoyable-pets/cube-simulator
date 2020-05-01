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
import java.util.concurrent.TimeUnit;

public class CubePanelGui implements ActionListener {
    JFrame frame;

    public static void main(String[] args) throws InterruptedException {
        CubePanelGui gui = new CubePanelGui();
        gui.go();
    }

    public void go() throws InterruptedException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int size = 100;
        Cube cube = new Cube(size);
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


        TimeUnit.SECONDS.sleep(3);


        Face faceTemp = cube.getFace(Side.FRONT, 0, 0);
        Face face = cube.getFace(Side.TOP, 0, 1);
        cube.setFace(face, Side.FRONT, 0, 0);
        cube.setFace(faceTemp, Side.TOP, 0, 1);

        frame.repaint();


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        frame.repaint();
    }
}
