package trees;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.Queue;

public class IterativeTraversal {
    private void inOrderTraversal(TreeNode root){

    }

    private void preOrderTraversal(TreeNode root){

    }

    private void postOrderTraversal(TreeNode root){

    }

    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode polledNode = queue.poll();
            System.out.println(polledNode.get());
            if (polledNode.getLeft()!= null){
                queue.add(polledNode.getLeft());
            }
            if (polledNode.getRight() != null)
                queue.add(polledNode.getRight());
        }
    }
}
