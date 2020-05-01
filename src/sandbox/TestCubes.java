import Cube.*;
import Settings.CubeColor;

public class TestCubes {

    public static void main(String[] args) {

        Cube cube = new Cube(100);

        TestCubes setupCubes = new TestCubes();
        setupCubes.start();
    }

    public void start()
    {
        int size = 100;
        Face faceY00 = new Face(CubeColor.yellow, size);
        Face faceY01 = new Face(CubeColor.yellow, size);
        Face faceY10 = new Face(CubeColor.yellow, size);
        Face faceY11 = new Face(CubeColor.yellow, size);
        Face faceG00 = new Face(CubeColor.green, size);
        Face faceG01 = new Face(CubeColor.green, size);
        Face faceG10 = new Face(CubeColor.green, size);
        Face faceG11 = new Face(CubeColor.green, size);
        Face faceR00 = new Face(CubeColor.red, size);
        Face faceR01 = new Face(CubeColor.red, size);
        Face faceR10 = new Face(CubeColor.red, size);
        Face faceR11 = new Face(CubeColor.red, size);
        Face faceW00 = new Face(CubeColor.white, size);
        Face faceW01 = new Face(CubeColor.white, size);
        Face faceW10 = new Face(CubeColor.white, size);
        Face faceW11 = new Face(CubeColor.white, size);
        Face faceOr00 = new Face(CubeColor.orange, size);
        Face faceOr01 = new Face(CubeColor.orange, size);
        Face faceOr10 = new Face(CubeColor.orange, size);
        Face faceOr11 = new Face(CubeColor.orange, size);
        Face faceB00 = new Face(CubeColor.blue, size);
        Face faceB01 = new Face(CubeColor.blue, size);
        Face faceB10 = new Face(CubeColor.blue, size);
        Face faceB11 = new Face(CubeColor.blue, size);

        Position positionC00 = new Position(Side.FRONT, 0, 0);
        Position positionC01 = new Position(Side.FRONT, 0, 1);
        Position positionC10 = new Position(Side.FRONT, 1, 0);
        Position positionC11 = new Position(Side.FRONT, 1, 1);
        Position positionT00 = new Position(Side.TOP, 0, 0);
        Position positionT01 = new Position(Side.TOP, 0, 1);
        Position positionT10 = new Position(Side.TOP, 1, 0);
        Position positionT11 = new Position(Side.TOP, 1, 1);
        Position positionL00 = new Position(Side.LEFT, 0, 0);
        Position positionL01 = new Position(Side.LEFT, 0, 1);
        Position positionL10 = new Position(Side.LEFT, 1, 0);
        Position positionL11 = new Position(Side.LEFT, 1, 1);
        Position positionB00 = new Position(Side.BOTTOM, 0, 0);
        Position positionB01 = new Position(Side.BOTTOM, 0, 1);
        Position positionB10 = new Position(Side.BOTTOM, 1, 0);
        Position positionB11 = new Position(Side.BOTTOM, 1, 1);
        Position positionR00 = new Position(Side.RIGHT, 0, 0);
        Position positionR01 = new Position(Side.RIGHT, 0, 1);
        Position positionR10 = new Position(Side.RIGHT, 1, 0);
        Position positionR11 = new Position(Side.RIGHT, 1, 1);
        Position positionK00 = new Position(Side.BACK, 0, 0);
        Position positionK01 = new Position(Side.BACK, 0, 1);
        Position positionK10 = new Position(Side.BACK, 1, 0);
        Position positionK11 = new Position(Side.BACK, 1, 1);

        positionC00.setFace(faceG00);
        positionC01.setFace(faceG01);
        positionC10.setFace(faceG10);
        positionC11.setFace(faceG11);
        positionT00.setFace(faceY00);
        positionT01.setFace(faceY01);
        positionT10.setFace(faceY10);
        positionT11.setFace(faceY11);
        positionL00.setFace(faceR00);
        positionL01.setFace(faceR01);
        positionL10.setFace(faceR10);
        positionL11.setFace(faceR11);
        positionB00.setFace(faceW00);
        positionB01.setFace(faceW01);
        positionB10.setFace(faceW10);
        positionB11.setFace(faceW11);
        positionR00.setFace(faceOr00);
        positionR01.setFace(faceOr01);
        positionR10.setFace(faceOr10);
        positionR11.setFace(faceOr11);
        positionK00.setFace(faceB00);
        positionK01.setFace(faceB01);
        positionK10.setFace(faceB10);
        positionK11.setFace(faceB11);

        Cubicle cubeGYR = new Cubicle();
        cubeGYR.addFace(faceG00);
        cubeGYR.addFace(faceY01);
        cubeGYR.addFace(faceR10);

        Cubicle cubeGYO = new Cubicle();
        cubeGYO.addFace(faceG01);
        cubeGYO.addFace(faceY11);
        cubeGYO.addFace(faceOr00);

        Cubicle cubeGWR = new Cubicle();
        cubeGWR.addFace(faceG01);
        cubeGWR.addFace(faceW00);
        cubeGWR.addFace(faceR11);

        Cubicle cubeGWO = new Cubicle();
        cubeGWO.addFace(faceG11);
        cubeGWO.addFace(faceW01);
        cubeGWO.addFace(faceOr01);


        Cubicle cubeBYO = new Cubicle();
        cubeBYO.addFace(faceB00);
        cubeBYO.addFace(faceY10);
        cubeBYO.addFace(faceOr01);

        Cubicle cubeBYR = new Cubicle();
        cubeBYR.addFace(faceB01);
        cubeBYR.addFace(faceY00);
        cubeBYR.addFace(faceR00);

        Cubicle cubeBWO = new Cubicle();
        cubeBWO.addFace(faceB01);
        cubeBWO.addFace(faceW11);
        cubeBWO.addFace(faceOr11);

        Cubicle cubeBWR = new Cubicle();
        cubeBWR.addFace(faceB11);
        cubeBWR.addFace(faceW01);
        cubeBWR.addFace(faceR01);
    }
}
