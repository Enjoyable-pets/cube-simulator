package Panels;

import Settings.CubeSize;

import javax.swing.*;
import java.awt.*;

public class CubeButton extends JButton {
    public CubeButton() {
        CubeSize cubeSize = new CubeSize();
        int insetSize = cubeSize.getButtonInsetSize();
        Insets buttonInsets = new Insets(insetSize, insetSize, insetSize, insetSize);
        setMargin(buttonInsets);
        setBounds(0, 0, cubeSize.getTileSize(), cubeSize.getTileSize());
    }
}
