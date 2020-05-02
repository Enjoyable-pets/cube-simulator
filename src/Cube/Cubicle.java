package Cube;

import java.util.ArrayList;

public class Cubicle {

    private ArrayList<Face> faces;
    private ArrayList<Position> positions;
    private String name;

    public Cubicle()
    {
        faces = new ArrayList<Face>();
        positions = new ArrayList<Position>();
    }

    public void addFace(Face face) {
        faces.add(face);
    }

    public ArrayList<Face> getFaces() {
        return faces;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
