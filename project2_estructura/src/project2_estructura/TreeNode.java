package project2_estructura;

/**
 *
 * @author Vinicio
 */
public class TreeNode {

    List Sons = new List();
    TreeNode Parent = null;

    public TreeNode(TreeNode Parent) {
        this.Parent = Parent;
    }

    public void add(Piece Piece) {
        Sons.insert(Sons.size() - 1, Piece);
    }

    public void remove() {
        Sons.remove(Sons.size() - 1);
    }

    public TreeNode getParent() {
        return Parent;
    }

    public boolean hasChildren() {
        return Sons.size() != 0;
    }
}
