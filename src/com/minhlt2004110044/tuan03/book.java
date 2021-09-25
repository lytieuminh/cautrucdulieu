package com.minhlt2004110044.tuan03;

public class book {
        String tensach;  
        String nhaXuatban;
        int namXuatban;  
        Double giaBan;   
        Double soLuong;  
        String theloai;
    
        book(){
        }
        book(String tensachmoi, String nhaxuatbanmoi, int namxuatbanmoi, double giabanmoi, double soluongmoi, String theloaimoi){
            tensach = tensachmoi ;
            nhaXuatban = nhaxuatbanmoi;
            namXuatban = namxuatbanmoi;
            giaBan = giabanmoi;
            soLuong = soluongmoi;
            theloai = theloaimoi;
        
        }

    }