package com.minhlt2004110044.tuan08;

public class BinarySearchTreetestdrive {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
    
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
       
        System.out.println(" các phần tử đã thêm vào cây "); 
        tree.inorder(); 
        }
        
    }
