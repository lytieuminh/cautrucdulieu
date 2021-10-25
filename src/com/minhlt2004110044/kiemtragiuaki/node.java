package com.minhlt2004110044.kiemtragiuaki;

public class node {

    apple data;
    node next;

    public node(){}

    public node(apple d){
        data = d;
        next = null;
    }

    public node (apple d, node n){
        data = d;
        next = n;
    }
}

