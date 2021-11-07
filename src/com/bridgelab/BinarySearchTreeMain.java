package com.bridgelab;

import com.bridgelab.BinarySearchTree;

public class BinarySearchTreeMain {
    public static void main(String[] args){
        System.out.println("Welcome To The Binary Search Tree Program");
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();
        myTree.add(56);
        myTree.add(30);
        myTree.add(70);
        myTree.print(myTree.root);
    }
}

