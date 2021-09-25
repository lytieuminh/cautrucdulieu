package com.minhlt200410044.tuan02;
import java.util.Scanner;
public class lab2bai3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); 
        System.out.print("nhập số điện sử dụng trong tháng  ");  
        double dien = scanner.nextInt();
        if(dien<50){
        System.out.println(" tiền điện tháng này ="+ dien*1000);
        }else{
        System.out.println(" tiền điện tháng này ="+ 50*1000+(dien-50)*1200);    
        }
        scanner.close();
    }
}