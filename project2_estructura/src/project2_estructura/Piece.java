package project2_estructura;

/**
 *
 * @author Vinicio
 */
public abstract class Piece {

    protected int x;
    protected int y;
    protected boolean color;

    public Piece(int x, int y, boolean color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[Piece]";
    }
}
