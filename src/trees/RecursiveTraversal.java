package trees;

public class RecursiveTraversal {
    public void inOrderTraversal(TreeNode root){
        if (root != null) {

            TreeNode left = root.getLeft();
            TreeNode right = root.getRight();
            if (left != null)
                inOrderTraversal(left);

            System.out.println(root.get());

            if (right != null)
                inOrderTraversal(right);

        }

    }
    public void preOrderTraversal(TreeNode root){
        if (root != null) {
            System.out.println(root.get());

            TreeNode left = root.getLeft();
            TreeNode right = root.getRight();
            if (left != null)
                preOrderTraversal(left);

            if (right != null)
                preOrderTraversal(right);

        }
    }

    public void postOrderTraversal(TreeNode root){
        if (root != null) {


            TreeNode left = root.getLeft();
            TreeNode right = root.getRight();
            if (left != null)
                postOrderTraversal(left);

            if (right != null)
                postOrderTraversal(right);

            System.out.println(root.get());
        }
    }
}
