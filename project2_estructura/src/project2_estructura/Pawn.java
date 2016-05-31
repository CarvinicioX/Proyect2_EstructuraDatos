package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class Pawn extends Piece {

    public Pawn(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        if (color) {
            return "[Pawnw]";
        } else {
            return "[Pawnb]";
        }
    }

    @Override
    public Piece[] moves() {
        Piece[] Return = new Piece[3];
        if (color) {
            if (y == 6) {
                Return = new Piece[4];
                Return[3] = new Pawn(x, y - 2, color);
            }
            Return[0] = new Pawn(x - 1, y - 1, this.color);
            Return[1] = new Pawn(x, y - 1, this.color);
            Return[2] = new Pawn(x + 1, y - 1, this.color);
        } else {
            if (y == 1) {
                Return = new Piece[4];
                Return[3] = new Pawn(x, y + 2, color);
            }
            Return[0] = new Pawn(x - 1, y + 1, this.color);
            Return[1] = new Pawn(x, y + 1, this.color);
            Return[2] = new Pawn(x + 1, y + 1, this.color);
        }
        return Return;
    }
}
