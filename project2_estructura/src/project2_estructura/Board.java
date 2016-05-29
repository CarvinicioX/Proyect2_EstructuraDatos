package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class Board {

    Piece[][] Pieces = null;

    public Board() {
        this.Pieces = new Piece[8][8];
    }

    public void addPiece(Piece Piece) {
        this.Pieces[Piece.x][Piece.y] = Piece;
    }

    public void removePiece(int x, int y) {
        this.Pieces[x][x] = null;
    }

    @Override
    public String toString() {
        String Return = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Return += this.Pieces[i][j];
            }
        }
        return Return;
    }
}
