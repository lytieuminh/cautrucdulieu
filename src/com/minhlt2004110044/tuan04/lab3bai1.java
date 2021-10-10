package com.minhlt2004110044.tuan04;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class lab3bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào 1 số bất kỳ: ");
        int x = scanner.nextInt();
        lab3bai1 snt = new lab3bai1();
        
        if (snt.ktraSoNT(x) == true) {
            System.out.println(x + " là số nguyên tố");
        } else {
            System.out.println(x + " không phải là số nguyên tố");
            scanner.close();
        }
    }



    public boolean ktraSoNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= sqrt((float) n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

