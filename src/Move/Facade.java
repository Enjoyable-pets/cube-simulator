package Move;

public class Facade {
    private int col;
    private int row;

    public Facade(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
