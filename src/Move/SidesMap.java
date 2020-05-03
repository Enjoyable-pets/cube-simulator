package Move;

import Cube.Side;
import Cube.Way;

public class SidesMap {

    private final Integer[][][] sides;

    public SidesMap() {
        sides = new Integer[6][6][2];
        int next = Way.NEXT;
        int prev = Way.PREV;

        sides[Side.FRONT][Side.TOP][next] = Side.RIGHT;
        sides[Side.FRONT][Side.TOP][prev] = Side.LEFT;
        sides[Side.FRONT][Side.RIGHT][next] = Side.BOTTOM;
        sides[Side.FRONT][Side.RIGHT][prev] = Side.TOP;
        sides[Side.FRONT][Side.BOTTOM][next] = Side.LEFT;
        sides[Side.FRONT][Side.BOTTOM][prev] = Side.RIGHT;
        sides[Side.FRONT][Side.LEFT][next] = Side.TOP;
        sides[Side.FRONT][Side.LEFT][prev] = Side.BOTTOM;

        sides[Side.BACK][Side.TOP][next] = Side.LEFT;
        sides[Side.BACK][Side.TOP][prev] = Side.RIGHT;
        sides[Side.BACK][Side.RIGHT][next] = Side.BOTTOM;
        sides[Side.BACK][Side.RIGHT][prev] = Side.TOP;
        sides[Side.BACK][Side.BOTTOM][next] = Side.RIGHT;
        sides[Side.BACK][Side.BOTTOM][prev] = Side.LEFT;
        sides[Side.BACK][Side.LEFT][next] = Side.TOP;
        sides[Side.BACK][Side.LEFT][prev] = Side.BOTTOM;

        sides[Side.TOP][Side.BACK][next] = Side.RIGHT;
        sides[Side.TOP][Side.BACK][prev] = Side.LEFT;
        sides[Side.TOP][Side.RIGHT][next] = Side.FRONT;
        sides[Side.TOP][Side.RIGHT][prev] = Side.BACK;
        sides[Side.TOP][Side.FRONT][next] = Side.LEFT;
        sides[Side.TOP][Side.FRONT][prev] = Side.RIGHT;
        sides[Side.TOP][Side.LEFT][next] = Side.BACK;
        sides[Side.TOP][Side.LEFT][prev] = Side.FRONT;

        sides[Side.BOTTOM][Side.FRONT][next] = Side.RIGHT;
        sides[Side.BOTTOM][Side.FRONT][prev] = Side.LEFT;
        sides[Side.BOTTOM][Side.RIGHT][next] = Side.BACK;
        sides[Side.BOTTOM][Side.RIGHT][prev] = Side.FRONT;
        sides[Side.BOTTOM][Side.BACK][next] = Side.LEFT;
        sides[Side.BOTTOM][Side.BACK][prev] = Side.RIGHT;
        sides[Side.BOTTOM][Side.LEFT][next] = Side.FRONT;
        sides[Side.BOTTOM][Side.LEFT][prev] = Side.BACK;

        sides[Side.RIGHT][Side.TOP][next] = Side.BACK;
        sides[Side.RIGHT][Side.TOP][prev] = Side.FRONT;
        sides[Side.RIGHT][Side.BACK][next] = Side.BOTTOM;
        sides[Side.RIGHT][Side.BACK][prev] = Side.TOP;
        sides[Side.RIGHT][Side.BOTTOM][next] = Side.FRONT;
        sides[Side.RIGHT][Side.BOTTOM][prev] = Side.BACK;
        sides[Side.RIGHT][Side.FRONT][next] = Side.TOP;
        sides[Side.RIGHT][Side.FRONT][prev] = Side.BOTTOM;

        sides[Side.LEFT][Side.TOP][next] = Side.FRONT;
        sides[Side.LEFT][Side.TOP][prev] = Side.BACK;
        sides[Side.LEFT][Side.FRONT][next] = Side.BOTTOM;
        sides[Side.LEFT][Side.FRONT][prev] = Side.TOP;
        sides[Side.LEFT][Side.BOTTOM][next] = Side.BACK;
        sides[Side.LEFT][Side.BOTTOM][prev] = Side.FRONT;
        sides[Side.LEFT][Side.BACK][next] = Side.TOP;
        sides[Side.LEFT][Side.BACK][prev] = Side.BOTTOM;
    }

    public int getNext(int facade, int side) {
        return sides[facade][side][Way.NEXT];
    }

    public int getPrevious(int facade, int side) {
        return sides[facade][side][Way.PREV];
    }
}
