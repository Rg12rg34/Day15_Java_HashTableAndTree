package com.bridgelab;

public class BinarySearchTree  <K extends Comparable<K>> {
    Node<K> root;

    public void add(int Key) {
        Node<K> newNode = new Node<K>(Key);
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node<K> current = root;
            Node<K> parent = null;
            while (true) {
                parent = current;
                // if key less than root assigning to left
                if (Key < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                // Assigning key to right
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void print(Node<K> node) {
        if (node == null) {
            System.out.println("Tree is empty");
        } else {
            if (node.left != null)
                print(node.left);
            System.out.print(node.key + " ");
            if (node.right != null)
                print(node.right);

        }
    }
}