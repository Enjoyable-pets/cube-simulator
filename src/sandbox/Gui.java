import javax.swing.*;
import java.awt.event.*;

public class Gui implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click here");
        button.setSize(50, 20);

        button.addActionListener(this);

        DrawPanel panel = new DrawPanel();

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I've been clicked!");
    }
}
