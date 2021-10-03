package com.minhlt2004110044.tuan04;

public class baitapmang_nhanvien {
    String tenNhanvien ;
    int luong ;
    String diaChi;
    String boPhanlamviec;
    String ngaysinh;
    int nhanvienbiduoi;
    baitapmang_nhanvien(){

    }
    baitapmang_nhanvien(String tenNhanvienmoi, int luongmoi, String diachimoi, String vitrimoi, String ngaysinhmoi){
        tenNhanvien = tenNhanvienmoi;
        luong = luongmoi;
        diaChi = diachimoi;
        boPhanlamviec = vitrimoi;
        ngaysinh = ngaysinhmoi;
    }



    void inthongtin(){
        System.out.println(" tên nhân viên : "+ tenNhanvien + " / lương : "+ luong + " / địa chỉ : "+ diaChi + " / bộ phân làm việc : "+ boPhanlamviec +" / ngày sinh : "+ ngaysinh );     
        }
    }


    