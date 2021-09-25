package com.minhlt2004110044.tuan03;

public class accounttestdrive {
    public static void main(String[] args) {
        account account;
        account = new account("Lý Tiểu Minh",88887777,1999999.0);
        System.out.println("Tên chủ tài khoản:" +account.tenChutaikhoan);
        System.out.println("Số Tài khoản: " +account.sotaikhoan);
        System.out.println("Số dư Tài Khoản: " + account.sodutaikhoan + "vnd");
    }
    
}

