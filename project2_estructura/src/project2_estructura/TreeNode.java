package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class TreeNode {

    TreeNode[] Sons = null;
    TreeNode Parent = null;
    Object Data = null;

    public TreeNode(TreeNode Parent, Object Data) {
        this.Parent = Parent;
        this.Data = Data;
    }

    public void initialize(int Movimientos) {
        this.Sons = new TreeNode[Movimientos];
    }

    public void addSon(Board Board) {
        for (int i = 0; i < Sons.length; i++) {
            if (Sons[i] == null) {
                Sons[i] = new TreeNode(this, Board);
                break;
            }
        }
    }

    public void remove(int Index) {
        Sons[Index] = null;
        for (int i = Index; i < this.Sons.length - 1; i++) {
            Sons[i] = Sons[i + 1];
        }
        Sons[Sons.length - 1] = null;
    }

    public TreeNode getParent() {
        return Parent;
    }

    public boolean hasChildren() {
        return Sons.length != 0;
    }
}
