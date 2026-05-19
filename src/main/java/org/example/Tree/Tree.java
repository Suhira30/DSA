package org.example.Tree;

public class Tree {
Node root ;

//DFS(Depth first search :has 3 type)
    //Root -> Left -> Right
public void preOrder(Node root) {
    if (root == null) {
        return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}

    //Left -> Root -> Right
    public void inOrder(Node root) {
    if (root == null) {
        return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
    }

    //Left -> Right -> Root
    public void postOrder(Node root) {
    if (root == null) {
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
    }

}
