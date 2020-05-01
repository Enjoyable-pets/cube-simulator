package Cube;

import java.awt.*;

public class Position {
    int side;
    int col;
    int row;
    Face face;

    public Position(int side, int col, int row) {
        this.side = side;
        this.col = col;
        this.row = row;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
        if (face.getPosition() != this) {
            face.setPosition(this);
        }
    }

    public Color getColor() { return face.getColor(); }
}
