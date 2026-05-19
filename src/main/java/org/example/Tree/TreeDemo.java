package org.example.Tree;

public class TreeDemo {
public static void main(String[] args) {
    Tree tree = new Tree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    tree.preOrder(tree.root);
    System.out.println();
    tree.postOrder(tree.root);
    System.out.println();
    tree.inOrder(tree.root);
}
}
