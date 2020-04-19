package Settings;

import java.awt.*;

public class CubeColor {
    public static final Color white;
    public static final Color yellow;
    public static final Color orange;
    public static final Color red;
    public static final Color green;
    public static final Color blue;

    static {
        white = Color.white;
        yellow = new Color(220, 200, 0);
        orange = new Color(255, 125, 0);
        red = new Color(200, 0, 0);
        green = new Color(0, 125, 0);
        blue = new Color(0, 0, 200);
    }
}
