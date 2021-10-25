package com.minhlt2004110044.tuan08;

import java.util.Stack;

public class test {
      public static void main(String[] args) {
        Stack<String> stack;

        stack = new Stack<> ();
        stack.push(" welcome to ");
        stack.push(" ricefield ");
        stack.push(" UwU ");

        System.out.println(stack);

        String poped = stack.pop();

        System.out.println(" phần tử đã lấy từ danh sách " + poped);
        System.out.println(" phần tử con lại của danh sách");
        System.out.println(stack);

        String phantuduoctham = stack.peek();
        System.out.println(" phan tử đỉnh: " + phantuduoctham);

        System.out.println(stack);

    }
}
