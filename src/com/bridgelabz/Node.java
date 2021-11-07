package com.bridgelabz;

public class Node <K extends Comparable<K>> {
    int key;
    Node<K> left;
    Node<K> right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}