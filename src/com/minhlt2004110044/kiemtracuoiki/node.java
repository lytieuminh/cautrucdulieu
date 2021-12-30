package com.minhlt2004110044.kiemtracuoiki;

public class node {

        sanpham data;
        node next;
    
        public node(){}
    
        public node(sanpham d){
            data = d;
            next = null;
        }
    
        public node (sanpham d, node n){
            data = d;
            next = n;
        }
    }
    
    

