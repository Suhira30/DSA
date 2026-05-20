package org.example.Tree;

public class BST {
    Node root;
    public Node insertion(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left=insertion(root.left, data);
        } else if (data > root.data) {
            root.right=insertion(root.right, data);
        }
        return root;
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

    //Search
    public boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if(root.data > data){
            return search(root.left, data);
        }
        return search(root.right, data);
    }
}
