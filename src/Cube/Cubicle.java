package Cube;

import java.util.ArrayList;

public class Cubicle {

    private ArrayList<Face> faces;
    private String name;

    public Cubicle()
    {
        faces = new ArrayList<Face>();
    }

    public void addFace(Face face) {
        faces.add(face);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
