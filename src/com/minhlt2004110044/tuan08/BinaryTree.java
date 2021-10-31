package com.minhlt2004110044.tuan08;

public class BinaryTree 
    { 

    // Root của cây 
    node root; 
   
    BinaryTree() 
{ 
   root = null; 
} 

    public node addRecursive(node current, int value) {
        if (current == null) {
            return new node(value);
        }
    
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            
            return current;
        }
    
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }

 
// hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp 
    public void inorderRec(node root) 
{ 
        if (root != null) 
    { 
            inorderRec(root.left); 
            System.out.print(root.value + " "); 
            inorderRec(root.right); 
    }     
}

    public void inorder() 
    { 
        inorderRec(root); 
    } 


}
