package Trees;

public class RecursiveTraversal {
    public void inOrderTraversal(TreeNode root){
        if (root != null) {
            System.out.println(root.get());
            TreeNode left = root.getLeft();
            TreeNode right = root.getRight();
            if (left != null) {
                inOrderTraversal(left);
            }
            if (right != null) {
                inOrderTraversal(right);
            }

        }

    }
    public void preOrderTraversal(TreeNode root){

    }

    public void postOrderTraversal(TreeNode root){

    }
}
