package core;

import trees.RecursiveTraversal;
import trees.TreeNode;

public class Main {

    public static void main(String[] args){
        TreeNode rootNode = new TreeNode(1);
        TreeNode firstLeft = new TreeNode(2);
        TreeNode firstRight = new TreeNode(3);
        rootNode.left(firstLeft);
        rootNode.right(firstRight);

        TreeNode secondLeft = new TreeNode(4);
        TreeNode secondRight = new TreeNode(5);

        firstLeft.left(secondLeft);
        firstLeft.right(secondRight);

        RecursiveTraversal traversal = new RecursiveTraversal();

        System.out.println("[*] Inorder Traversal ...");

        traversal.inOrderTraversal(rootNode);

        System.out.println("[*] PreOrder Traversal ...");

        traversal.preOrderTraversal(rootNode);

        System.out.println("[*] PostOrder Traversal ...");
        traversal.postOrderTraversal(rootNode);


    }
}
