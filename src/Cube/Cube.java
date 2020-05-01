package Cube;

import Settings.CubeColor;

import java.awt.*;

public class Cube {

    Position[][][] positions = new Position[6][2][2];
    Face[][][] faces = new Face[6][2][2];
    Cubicle[][][] cubicles = new Cubicle[6][2][2];

    public Cube(int cubicleSize) {
        createPositions();
        createFaces(cubicleSize);
        setFacesToPositions();
        createCubicles();
    }

    public Position getPosition(int side, int col, int row) {
        return positions[side][col][row];
    }

    public Color getColor(int side, int col, int row) {
        Position position = positions[side][col][row];

        return position.getColor();
    }

    public void move(int side, int way) {

    }

    private void createPositions()
    {
        positions[Side.FRONT][0][0] = new Position(Side.FRONT, 0, 0);
        positions[Side.FRONT][0][1] = new Position(Side.FRONT, 0, 1);
        positions[Side.FRONT][1][0] = new Position(Side.FRONT, 1, 0);
        positions[Side.FRONT][1][1] = new Position(Side.FRONT, 1, 1);

        positions[Side.TOP][0][0] = new Position(Side.TOP, 0, 0);
        positions[Side.TOP][0][1] = new Position(Side.TOP, 0, 1);
        positions[Side.TOP][1][0] = new Position(Side.TOP, 1, 0);
        positions[Side.TOP][1][1] = new Position(Side.TOP, 1, 1);

        positions[Side.LEFT][0][0] = new Position(Side.LEFT, 0, 0);
        positions[Side.LEFT][0][1] = new Position(Side.LEFT, 0, 1);
        positions[Side.LEFT][1][0] = new Position(Side.LEFT, 1, 0);
        positions[Side.LEFT][1][1] = new Position(Side.LEFT, 1, 1);

        positions[Side.BOTTOM][0][0] = new Position(Side.BOTTOM, 0, 0);
        positions[Side.BOTTOM][0][1] = new Position(Side.BOTTOM, 0, 1);
        positions[Side.BOTTOM][1][0] = new Position(Side.BOTTOM, 1, 0);
        positions[Side.BOTTOM][1][1] = new Position(Side.BOTTOM, 1, 1);

        positions[Side.RIGHT][0][0] = new Position(Side.RIGHT, 0, 0);
        positions[Side.RIGHT][0][1] = new Position(Side.RIGHT, 0, 1);
        positions[Side.RIGHT][1][0] = new Position(Side.RIGHT, 1, 0);
        positions[Side.RIGHT][1][1] = new Position(Side.RIGHT, 1, 1);

        positions[Side.BACK][0][0] = new Position(Side.BACK, 0, 0);
        positions[Side.BACK][0][1] = new Position(Side.BACK, 0, 1);
        positions[Side.BACK][1][0] = new Position(Side.BACK, 1, 0);
        positions[Side.BACK][1][1] = new Position(Side.BACK, 1, 1);
    }

    public void createFaces(int cubicleSize) {
        faces[Side.YELLOW][0][0] = new Face(CubeColor.yellow, cubicleSize);
        faces[Side.YELLOW][0][1] = new Face(CubeColor.yellow, cubicleSize);
        faces[Side.YELLOW][1][0] = new Face(CubeColor.yellow, cubicleSize);
        faces[Side.YELLOW][1][1] = new Face(CubeColor.yellow, cubicleSize);

        faces[Side.GREEN][0][0] = new Face(CubeColor.green, cubicleSize);
        faces[Side.GREEN][0][1] = new Face(CubeColor.green, cubicleSize);
        faces[Side.GREEN][1][0] = new Face(CubeColor.green, cubicleSize);
        faces[Side.GREEN][1][1] = new Face(CubeColor.green, cubicleSize);

        faces[Side.WHITE][0][0] = new Face(CubeColor.white, cubicleSize);
        faces[Side.WHITE][0][1] = new Face(CubeColor.white, cubicleSize);
        faces[Side.WHITE][1][0] = new Face(CubeColor.white, cubicleSize);
        faces[Side.WHITE][1][1] = new Face(CubeColor.white, cubicleSize);

        faces[Side.RED][0][0] = new Face(CubeColor.red, cubicleSize);
        faces[Side.RED][0][1] = new Face(CubeColor.red, cubicleSize);
        faces[Side.RED][1][0] = new Face(CubeColor.red, cubicleSize);
        faces[Side.RED][1][1] = new Face(CubeColor.red, cubicleSize);

        faces[Side.ORANGE][0][0] = new Face(CubeColor.orange, cubicleSize);
        faces[Side.ORANGE][0][1] = new Face(CubeColor.orange, cubicleSize);
        faces[Side.ORANGE][1][0] = new Face(CubeColor.orange, cubicleSize);
        faces[Side.ORANGE][1][1] = new Face(CubeColor.orange, cubicleSize);

        faces[Side.BLUE][0][0] = new Face(CubeColor.blue, cubicleSize);
        faces[Side.BLUE][0][1] = new Face(CubeColor.blue, cubicleSize);
        faces[Side.BLUE][1][0] = new Face(CubeColor.blue, cubicleSize);
        faces[Side.BLUE][1][1] = new Face(CubeColor.blue, cubicleSize);
    }

    private void setFacesToPositions()
    {
        positions[Side.FRONT][0][0].setFace(faces[Side.GREEN][0][0]);
        positions[Side.FRONT][0][1].setFace(faces[Side.GREEN][0][1]);
        positions[Side.FRONT][1][0].setFace(faces[Side.GREEN][1][0]);
        positions[Side.FRONT][1][1].setFace(faces[Side.GREEN][1][1]);

        positions[Side.TOP][0][0].setFace(faces[Side.YELLOW][0][0]);
        positions[Side.TOP][0][1].setFace(faces[Side.YELLOW][0][1]);
        positions[Side.TOP][1][0].setFace(faces[Side.YELLOW][1][0]);
        positions[Side.TOP][1][1].setFace(faces[Side.YELLOW][1][1]);

        positions[Side.LEFT][0][0].setFace(faces[Side.RED][0][0]);
        positions[Side.LEFT][0][1].setFace(faces[Side.RED][0][1]);
        positions[Side.LEFT][1][0].setFace(faces[Side.RED][1][0]);
        positions[Side.LEFT][1][1].setFace(faces[Side.RED][1][1]);

        positions[Side.BOTTOM][0][0].setFace(faces[Side.WHITE][0][0]);
        positions[Side.BOTTOM][0][1].setFace(faces[Side.WHITE][0][1]);
        positions[Side.BOTTOM][1][0].setFace(faces[Side.WHITE][1][0]);
        positions[Side.BOTTOM][1][1].setFace(faces[Side.WHITE][1][1]);

        positions[Side.RIGHT][0][0].setFace(faces[Side.ORANGE][0][0]);
        positions[Side.RIGHT][0][1].setFace(faces[Side.ORANGE][0][1]);
        positions[Side.RIGHT][1][0].setFace(faces[Side.ORANGE][1][0]);
        positions[Side.RIGHT][1][1].setFace(faces[Side.ORANGE][1][1]);

        positions[Side.BACK][0][0].setFace(faces[Side.BLUE][0][0]);
        positions[Side.BACK][0][1].setFace(faces[Side.BLUE][0][1]);
        positions[Side.BACK][1][0].setFace(faces[Side.BLUE][1][0]);
        positions[Side.BACK][1][1].setFace(faces[Side.BLUE][1][1]);
    }

    private void createCubicles() {

        Cubicle cubeGYR = new Cubicle();
        cubeGYR.addFace(faces[Side.GREEN][0][0]);
        cubeGYR.addFace(faces[Side.YELLOW][0][1]);
        cubeGYR.addFace(faces[Side.RED][1][0]);
        cubeGYR.setName("GYR");
        cubicles[Side.FRONT][0][0] = cubeGYR;

        Cubicle cubeGYO = new Cubicle();
        cubeGYO.addFace(faces[Side.GREEN][0][1]);
        cubeGYO.addFace(faces[Side.YELLOW][1][1]);
        cubeGYO.addFace(faces[Side.ORANGE][0][0]);
        cubeGYO.setName("GYO");
        cubicles[Side.FRONT][0][1] = cubeGYO;

        Cubicle cubeGWR = new Cubicle();
        cubeGWR.addFace(faces[Side.GREEN][0][1]);
        cubeGWR.addFace(faces[Side.WHITE][0][0]);
        cubeGWR.addFace(faces[Side.RED][1][1]);
        cubeGWR.setName("GWR");
        cubicles[Side.FRONT][1][0] = cubeGWR;

        Cubicle cubeGWO = new Cubicle();
        cubeGWO.addFace(faces[Side.GREEN][1][1]);
        cubeGWO.addFace(faces[Side.WHITE][0][1]);
        cubeGWO.addFace(faces[Side.ORANGE][0][1]);
        cubeGWO.setName("GWO");
        cubicles[Side.FRONT][1][1] = cubeGWO;


        Cubicle cubeBYO = new Cubicle();
        cubeBYO.addFace(faces[Side.BLUE][0][0]);
        cubeBYO.addFace(faces[Side.YELLOW][1][0]);
        cubeBYO.addFace(faces[Side.ORANGE][0][1]);
        cubeBYO.setName("BYO");
        cubicles[Side.BACK][0][0] = cubeBYO;

        Cubicle cubeBYR = new Cubicle();
        cubeBYR.addFace(faces[Side.BLUE][0][1]);
        cubeBYR.addFace(faces[Side.YELLOW][0][0]);
        cubeBYR.addFace(faces[Side.RED][0][0]);
        cubeBYR.setName("BYR");
        cubicles[Side.BACK][0][1] = cubeBYR;

        Cubicle cubeBWO = new Cubicle();
        cubeBWO.addFace(faces[Side.BLUE][0][1]);
        cubeBWO.addFace(faces[Side.WHITE][1][1]);
        cubeBWO.addFace(faces[Side.ORANGE][1][1]);
        cubeBWO.setName("BWO");
        cubicles[Side.BACK][1][0] = cubeBWO;

        Cubicle cubeBWR = new Cubicle();
        cubeBWR.addFace(faces[Side.BLUE][1][1]);
        cubeBWR.addFace(faces[Side.WHITE][0][1]);
        cubeBWR.addFace(faces[Side.RED][0][1]);
        cubeBWR.setName("BWR");
        cubicles[Side.BACK][1][1] = cubeBWR;
    }
}
