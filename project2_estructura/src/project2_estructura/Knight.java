package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class Knight extends Piece {

    public Knight(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (color) {
            return "[Knightw]";
        } else {
            return "[Knightb]";
        }
    }

    @Override
    public Piece[] moves() {
        Piece[] Return = new Piece[8];
        Return[0] = new Knight(x - 1, y - 2, this.color);
        Return[1] = new Knight(x + 1, y - 2, this.color);
        Return[2] = new Knight(x - 2, y - 1, this.color);
        Return[3] = new Knight(x + 2, y - 1, this.color);
        Return[4] = new Knight(x - 2, y + 1, this.color);
        Return[5] = new Knight(x + 2, y + 1, this.color);
        Return[6] = new Knight(x - 1, y + 2, this.color);
        Return[7] = new Knight(x + 1, y + 2, this.color);
        return Return;
    }
}
