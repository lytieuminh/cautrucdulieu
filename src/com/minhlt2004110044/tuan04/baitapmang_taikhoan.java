package com.minhlt2004110044.tuan04;

public class baitapmang_taikhoan {
    String tenChutaikhoan;
    int sotaikhoan;
    Double sodutaikhoan;
    int taikhoanmuonxoa;
    baitapmang_taikhoan(){
    
    }
    baitapmang_taikhoan(String tenChutaikhoanmoi, int sotaikhoanmoi, Double sodutaikhoanmoi){
        tenChutaikhoan = tenChutaikhoanmoi;
        sotaikhoan = sotaikhoanmoi;
        sodutaikhoan = sodutaikhoanmoi;
    }
    void inthongtin(){
    System.out.println(" tên chủ tài khoản  : "+ tenChutaikhoan + " / số tài khoản : "+ sotaikhoan + " / số dư trong tài khoản : "+ sodutaikhoan + "vnd");
    }
}