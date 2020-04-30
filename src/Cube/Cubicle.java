package Cube;

import java.util.ArrayList;

public class Cubicle {
    ArrayList<Face> faces;

    public Cubicle()
    {
        faces = new ArrayList<Face>();
    }

    public void addFace(Face face) {
        faces.add(face);
    }
}
