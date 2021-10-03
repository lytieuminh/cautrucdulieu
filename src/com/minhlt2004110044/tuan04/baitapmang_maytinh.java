package com.minhlt2004110044.tuan04;

public class baitapmang_maytinh {
    String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String cpu;
    Double giamay;
    String nambaohanh;
    int maytinhbixoa;
    baitapmang_maytinh(){

    }
    baitapmang_maytinh(String nhasanxuatmoi, String  namsanxuatmoi, String hedieuhanhmoi, String rammoi, String cpumoi, Double giamaymoi, String nambaohanhmoi){
        nhasanxuat = nhasanxuatmoi ;
        namsanxuat = namsanxuatmoi;
        hedieuhanh = hedieuhanhmoi;
        ram = rammoi ;
        cpu = cpumoi;
        giamay = giamaymoi ;
        nambaohanh = nambaohanhmoi ;
    }
    void inthongtin(){
        System.out.println(" nhà sản xuất : "+ nhasanxuat + " / năm sản xuất  : "+ namsanxuat + " / hệ điều hành : "+ hedieuhanh + " / ram : "+ ram +" / cpu : "+ cpu  + " / giá máy : " + giamay +" vnd " + "/ năm bảo hành : "+ nambaohanh);     
        }
    }

    