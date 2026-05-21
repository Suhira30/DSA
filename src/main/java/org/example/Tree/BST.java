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

    //Find min
    public int minimum(Node root) {
        if (root == null) {
            System.out.println("root is null");
            return 0;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }

    //Find max
    public int maximum(Node root) {
        if (root == null) {
            System.out.println("root is null");
            return 0;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }

    //Deletion
    public Node delete(Node root, int value) {
        BST bst = new BST();
        // STEP 1: find the node
        if (root == null) {
            return null;
        }

        // go left
        if (value < root.data) {
            root.left = delete(root.left, value);
        }

        // go right
        else if (value > root.data) {
            root.right = delete(root.right, value);
        }

        // STEP 2: node found
        else {

            // CASE 1: Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // CASE 2: One child (right only)
            else if (root.left == null) {
                return root.right;
            }

            // CASE 2: One child (left only)
            else if (root.right == null) {
                return root.left;
            }

            // CASE 3: Two children
            else {

                // find inorder successor (smallest in right subtree)
                int minValue = bst.minimum(root.right);

                // replace current node value
                root.data = minValue;

                // delete duplicate from right subtree
                root.right = delete(root.right, minValue);
            }
        }

        return root;
    }


}
