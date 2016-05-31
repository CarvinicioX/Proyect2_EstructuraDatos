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
                if (this.Pieces[j][i] != null) {
                    Return += this.Pieces[j][i].toString();
                } else {
                    Return += "[null]";
                }
            }
            Return += "\n";
        }
        return Return;
    }

    public Board[] moves(boolean color) {
        Piece[] moves = null;
        Board neo = null;
        Board[] Return = null;
        int Cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.Pieces[j][i] != null && color == this.Pieces[j][i].color) {
                    Cont += this.Pieces[j][i].moves().length;
                }
            }
        }
        System.out.println(Cont); 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.Pieces[j][i] != null && color == this.Pieces[j][i].color) {
                    moves = this.Pieces[j][i].moves();
                    neo = Copy(this);
                    for (int k = 0; k < moves.length; k++) {
                        try {
                            neo.Pieces[moves[k].x][moves[k].y] = moves[k];
                            neo.Pieces[j][i] = null;
                        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                            
                        }
                    }
                }
            }
        }
        System.out.println(this);
        System.out.println(neo);
        return null;
    }

    public Board Copy(Board toCopy) {
        Board copyed = new Board();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (toCopy.Pieces[j][i] instanceof King) {
                    copyed.Pieces[j][i] = new King(toCopy.Pieces[j][i].x, toCopy.Pieces[j][i].y, toCopy.Pieces[j][i].color);
                } else if (toCopy.Pieces[j][i] instanceof Knight) {
                    copyed.Pieces[j][i] = new Knight(toCopy.Pieces[j][i].x, toCopy.Pieces[j][i].y, toCopy.Pieces[j][i].color);
                } else if (toCopy.Pieces[j][i] instanceof Pawn) {
                    copyed.Pieces[j][i] = new Pawn(toCopy.Pieces[j][i].x, toCopy.Pieces[j][i].y, toCopy.Pieces[j][i].color);
                }
            }
        }
        return copyed;
    }
}
