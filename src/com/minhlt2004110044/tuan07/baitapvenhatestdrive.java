package com.minhlt2004110044.tuan07;


public class baitapvenhatestdrive {
    public static void main(String[] args) {
        baitapvenha baitapvenha = new baitapvenha();
        baitapvenha.add(4);
        baitapvenha.add(8);
        baitapvenha.add(5);
        System.out.println("danh sách ban đầu");
        baitapvenha.print();
        

        System.out.println("Sau khi thêm 1 nút vào cuối : 5");
        baitapvenha.add(5);
        baitapvenha.print();

        System.out.println("Sau khi thêm vào đầu danh sách : 10");
        baitapvenha.addHead(10);
        baitapvenha.print();

        System.out.println("Thêm vào trước số cần tìm trong danh sách : thêm 8 trước 5");
        baitapvenha.addAfter(5,8);
        baitapvenha.print();

        System.out.println("xóa nút đầu danh sách");
        baitapvenha.deleteHead();
        baitapvenha.print();

        System.out.println("xóa cuối danh sách");
        baitapvenha.deleteTail();
        baitapvenha.print();

        System.out.println("xóa vị số bất kỳ trong danh sách:  8");
        baitapvenha.delete(10);
        baitapvenha.print();

        System.out.println("sửa số 4 thành số 2");
        baitapvenha.fix(4, 2);
        baitapvenha.print();
    }
}