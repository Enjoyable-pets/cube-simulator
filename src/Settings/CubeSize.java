package Settings;

public class CubeSize {
    public static final int fullHeight;
    public static final int fullWidth;

    private final int tileSize = 90;
    private final int padding = 5;
    private final int borderSize = 10;
    private final int step;
    private final int c0;
    private final int c1;
    private final int c2;
    private final int c3;
    private final int c4;
    private final int c5;
    private final int c6;
    private final int c7;

    public CubeSize() {
        step = padding + tileSize;
        c0 = borderSize;
        c1 = c0 + step;
        c2 = c1 + step + padding;
        c3 = c2 + step;
        c4 = c3 + step + padding;
        c5 = c4 + step;
        c6 = c5 + step + padding;
        c7 = c6 + step;
    }

    static {
        CubeSize cubeSize = new CubeSize();
        int border = cubeSize.getBorderSize();
        fullWidth = cubeSize.getC7() + cubeSize.getTileSize() + border;
        fullHeight = cubeSize.getC5() + cubeSize.getTileSize() + 3 * border;
    }

    public int getTileSize() {
        return tileSize;
    }

    public int getPadding() {
        return padding;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public int getStep() {
        return step;
    }

    public int getC0() {
        return c0;
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public int getC3() {
        return c3;
    }

    public int getC4() {
        return c4;
    }

    public int getC5() {
        return c5;
    }

    public int getC6() {
        return c6;
    }

    public int getC7() {
        return c7;
    }

    public int getFullHeight() {
        return fullHeight;
    }

    public int getFullWidth() {
        return fullWidth;
    }
}
