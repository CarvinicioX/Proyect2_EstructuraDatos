package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class King extends Piece {

    public King(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (color) {
            return "[Kingw]";
        } else {
            return "[Kingb]";
        }
    }

    @Override
    public Piece[] moves() {
        Piece[] Return = new Piece[8];
        Return[0] = new King(x - 1, y - 1, this.color);
        Return[1] = new King(x, y - 1, this.color);
        Return[2] = new King(x + 1, y - 1, this.color);
        Return[3] = new King(x - 1, y, this.color);
        Return[4] = new King(x + 1, y, this.color);
        Return[5] = new King(x - 1, y + 1, this.color);
        Return[6] = new King(x, y + 1, this.color);
        Return[7] = new King(x + 1, y + 1, this.color);
        return Return;
    }
}
