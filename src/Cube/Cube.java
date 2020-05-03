package Cube;

import Settings.CubeColor;

import java.awt.*;

public class Cube {

    private Position[][][] positions = new Position[6][2][2];
    private Face[][][] faces = new Face[6][2][2];
    private Cubicle[][][] cubicles = new Cubicle[6][2][2];
    private String moveCode;

    public Cube(int cubicleSize) {
        createPositions();
        createFaces(cubicleSize);
        setFacesToPositions();
        createCubicles();
    }

    public Position getPosition(int side, int col, int row) {
        return positions[side][col][row];
    }

    public Face getFace(int side, int col, int row) {
        Position position = positions[side][col][row];

        return position.getFace();
    }

    public void setFace(Face face, int side, int col, int row) {
        Position position = positions[side][col][row];
        position.setFace(face);
    }

    public Color getColor(int side, int col, int row) {
        Position position = positions[side][col][row];

        return position.getColor();
    }

    public Cubicle getCubicle(int side, int col, int row) {
        return cubicles[side][col][row];
    }

    public void move(int side, int way) {
        boolean movedPretty = false;
        moveCode = String.valueOf(side) + way;

        Cubicle cubicle;

        System.out.print("Moved ");
        if (moveCode.equals("33")) {



            movedPretty = true;
            System.out.println("Top left down");
        }

        if (!movedPretty) {
            System.out.println(moveCode);
        }
    }

    private void changeFaces()
    {
        Cubicle tempCubicle = new Cubicle();
        Cubicle cubicle00 = getCubicle(Side.FRONT, 0, 0);
        Cubicle cubicle01 = getCubicle(Side.FRONT, 0, 1);
        Cubicle cubicle10 = getCubicle(Side.FRONT, 1, 0);
        Cubicle cubicle11 = getCubicle(Side.FRONT, 1, 1);
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
        Cubicle cubicle;

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.GREEN][0][0]);
        cubicle.addFace(faces[Side.YELLOW][0][1]);
        cubicle.addFace(faces[Side.RED][1][0]);
        cubicle.addPosition(positions[Side.FRONT][0][0]);
        cubicle.addPosition(positions[Side.TOP][0][1]);
        cubicle.addPosition(positions[Side.LEFT][1][0]);
        cubicles[Side.FRONT][0][0] = cubicle;
        cubicles[Side.TOP][0][1] = cubicle;
        cubicles[Side.LEFT][1][0] = cubicle;
        cubicle.setName("FrontTopLeft");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.GREEN][0][1]);
        cubicle.addFace(faces[Side.YELLOW][1][1]);
        cubicle.addFace(faces[Side.ORANGE][0][0]);
        cubicle.addPosition(positions[Side.FRONT][0][1]);
        cubicle.addPosition(positions[Side.TOP][1][1]);
        cubicle.addPosition(positions[Side.RIGHT][0][0]);
        cubicles[Side.FRONT][0][1] = cubicle;
        cubicles[Side.TOP][1][1] = cubicle;
        cubicles[Side.RIGHT][0][0] = cubicle;
        cubicle.setName("FrontTopRight");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.GREEN][1][0]);
        cubicle.addFace(faces[Side.WHITE][0][0]);
        cubicle.addFace(faces[Side.RED][1][1]);
        cubicle.addPosition(positions[Side.FRONT][1][0]);
        cubicle.addPosition(positions[Side.BOTTOM][0][0]);
        cubicle.addPosition(positions[Side.LEFT][1][1]);
        cubicles[Side.FRONT][1][0] = cubicle;
        cubicles[Side.BOTTOM][0][0] = cubicle;
        cubicles[Side.LEFT][1][1] = cubicle;
        cubicle.setName("FrontBottomLeft");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.GREEN][1][1]);
        cubicle.addFace(faces[Side.WHITE][1][0]);
        cubicle.addFace(faces[Side.ORANGE][0][1]);
        cubicle.addPosition(positions[Side.FRONT][1][1]);
        cubicle.addPosition(positions[Side.BOTTOM][1][0]);
        cubicle.addPosition(positions[Side.RIGHT][0][1]);
        cubicles[Side.FRONT][1][1] = cubicle;
        cubicles[Side.BOTTOM][1][0] = cubicle;
        cubicles[Side.RIGHT][0][1] = cubicle;
        cubicle.setName("FrontBottomRight");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.BLUE][0][0]);
        cubicle.addFace(faces[Side.YELLOW][1][0]);
        cubicle.addFace(faces[Side.ORANGE][0][1]);
        cubicle.addPosition(positions[Side.BACK][0][0]);
        cubicle.addPosition(positions[Side.TOP][1][0]);
        cubicle.addPosition(positions[Side.LEFT][0][1]);
        cubicles[Side.BACK][0][0] = cubicle;
        cubicles[Side.TOP][1][0] = cubicle;
        cubicles[Side.LEFT][0][1] = cubicle;
        cubicle.setName("BackTopLeft");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.BLUE][0][1]);
        cubicle.addFace(faces[Side.YELLOW][0][0]);
        cubicle.addFace(faces[Side.RED][0][0]);
        cubicle.addPosition(positions[Side.BACK][0][1]);
        cubicle.addPosition(positions[Side.TOP][0][0]);
        cubicle.addPosition(positions[Side.RIGHT][0][0]);
        cubicles[Side.BACK][0][1] = cubicle;
        cubicles[Side.TOP][0][0] = cubicle;
        cubicles[Side.RIGHT][0][0] = cubicle;
        cubicle.setName("BackTopRight");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.BLUE][1][0]);
        cubicle.addFace(faces[Side.WHITE][1][1]);
        cubicle.addFace(faces[Side.ORANGE][1][1]);
        cubicle.addPosition(positions[Side.BACK][1][0]);
        cubicle.addPosition(positions[Side.BOTTOM][1][1]);
        cubicle.addPosition(positions[Side.LEFT][1][1]);
        cubicles[Side.BACK][1][0] = cubicle;
        cubicles[Side.BOTTOM][1][1] = cubicle;
        cubicles[Side.LEFT][1][1] = cubicle;
        cubicle.setName("BackBottomLeft");

        cubicle = new Cubicle();
        cubicle.addFace(faces[Side.BLUE][1][1]);
        cubicle.addFace(faces[Side.WHITE][0][1]);
        cubicle.addFace(faces[Side.RED][0][1]);
        cubicle.addPosition(positions[Side.BACK][1][1]);
        cubicle.addPosition(positions[Side.BOTTOM][0][1]);
        cubicle.addPosition(positions[Side.RIGHT][0][1]);
        cubicles[Side.BACK][1][1] = cubicle;
        cubicles[Side.BOTTOM][0][1] = cubicle;
        cubicles[Side.RIGHT][0][1] = cubicle;
        cubicle.setName("BackBottomRight");
    }
}
