package com.minhlt2004110044.tuan03;

public class booktestdrive {

    public static void main(String[] args) {
        book book;
        book = new book("Đệ Nhất kiếm tiền "," 5G ",2020,799000,5000," Tài chính kinh tế ");

        System.out.println ("Tên sách: " + book.tensach);
        System.out.println ("Nhà xuất bản: " + book.nhaXuatban);
        System.out.println ("Năm xuất bản: " + book.namXuatban);
        System.out.println ("Giá bán: " +book.giaBan + "vnd");
        System.out.println ("Số lượng: " +book.soLuong);
        System.out.println ("Loại sách: " +book.theloai);
    }
    
}