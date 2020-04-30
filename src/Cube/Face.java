package Cube;

import java.awt.*;

public class Face {
    Color color;
    int size;
    Position position;

    public Face(Color color, int size) {
        this.color = color;
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
        if (position.getFace() != this) {
            position.setFace(this);
        }
    }
}
