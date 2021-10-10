package com.minhlt2004110044.tuan05;

import java.util.Scanner;
import java.util.ArrayList;

public class lab4bai1 {
    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.print("Nhập số thực tùy ý: ");
        int x = scanner.nextInt();
        list.add(x);
        System.out.print("Nhập thêm (Y/N)?: ");
        scanner.nextLine();
        if(scanner.nextLine().equals("N"))
            break;
    }
    int tong = 0;
    for (int x : list) {
        System.out.print(x+"    ");
        tong += x;
    }
    System.out.println("\nTổng = " + tong);
    scanner.close();
}
}
