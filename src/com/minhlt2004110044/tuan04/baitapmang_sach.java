package com.minhlt2004110044.tuan04;

public class baitapmang_sach {

        String tensach;  
        String nhaXuatban;
        int namXuatban;  
        Double giaBan;   
        int soLuong;  
        String theloai;
        int sachmuonxoa;
        baitapmang_sach(){
        }
        baitapmang_sach(String tensachmoi, String nhaxuatbanmoi, int namxuatbanmoi, double giabanmoi, int soluongmoi, String theloaimoi){
            tensach = tensachmoi ;
            nhaXuatban = nhaxuatbanmoi;
            namXuatban = namxuatbanmoi;
            giaBan = giabanmoi;
            soLuong = soluongmoi;
            theloai = theloaimoi;
        
        }

    void inthongtin(){
        System.out.println(" tensach : "+ tensach + " / nhaXuatban : "+ nhaXuatban + " / namXuatban : "+ namXuatban + " / giaBan : "+ giaBan +" / soLuong : "+ soLuong  + " / theloai : " + theloai);     
        }
    }
