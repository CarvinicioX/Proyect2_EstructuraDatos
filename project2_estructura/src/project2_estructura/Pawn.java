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
        return "[Pawn]";
    }
}
