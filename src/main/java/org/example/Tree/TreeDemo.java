package org.example.Tree;

public class TreeDemo {
public static void main(String[] args) {
    Tree tree = new Tree();
    //Binary Tree
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
    System.out.println();

    //BST
    BST bst = new BST();
    System.out.print("Binary Search tree: ");
    bst.root=bst.insertion(bst.root,50);
    bst.root=bst.insertion(bst.root,20);
    bst.root=bst.insertion(bst.root,30);
    bst.root=bst.insertion(bst.root,40);
    bst.root=bst.insertion(bst.root,10);
    bst.root=bst.insertion(bst.root,15);

    bst.inOrder(bst.root);

    System.out.println();
    System.out.println("data is available: "+bst.search(bst.root,20));
    System.out.println("data is available: "+bst.search(bst.root,1000));
}
}
