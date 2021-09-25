package com.minhlt2004110044.tuan03;

public class computertestdrive {
    public static void main(String[] args) {
        computer computer;
        computer = new computer("intel", 2020, "Window 10", "16Gb", "Intel Core i5 10500K ",25750000.0, 2);

        System.out.println ("Nhà sản xuất: " + computer.nhasanxuat);
        System.out.println ("Năm sản xuất: " + computer.namsanxuat);
        System.out.println ("Hệ điều hành: " + computer.hedieuhanh);
        System.out.println ("Ram: " + computer.ram);
        System.out.println ("CPU: " + computer.cpu);
        System.out.println ("Giá máy tính: " + computer.giamay + "vnd");
        System.out.println ("Năm bảo hành: " + computer.nambaohanh + " năm");
    }
    
}