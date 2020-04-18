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

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(700, 580);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        frame.repaint();
    }
}
