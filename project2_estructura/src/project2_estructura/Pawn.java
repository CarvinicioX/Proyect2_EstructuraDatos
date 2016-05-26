package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class Pawn {

    private int x;
    private int y;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return x;
    }

    public void setN(int N) {
        this.x = N;
    }

    public int getL() {
        return y;
    }

    public void setL(int L) {
        this.y = L;
    }
}
