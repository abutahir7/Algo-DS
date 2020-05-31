package Trees;

import Core.Node;
import com.sun.source.tree.Tree;

public class TreeNode extends Node {
    TreeNode _left = null;
    TreeNode _right = null;
    public TreeNode(int _val) {
        super(_val);
    }

    public TreeNode left(TreeNode leftNode){
        this._left = leftNode;
        return this;
    }

    public TreeNode right(TreeNode rightNode){
        this._right = rightNode;
        return this;
    }

    public TreeNode getLeft(){
        return this._left;
    }

    public TreeNode getRight() {
        return this._right;
    }

    public String toString(){
        return String.format("val = %s\tleft = %s\t right = %s\n", this.get(), this._left, this._right);
    }
}
