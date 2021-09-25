package com.minhlt2004110044.tuan03;

public class stafftestdrive {
    
    public static void main(String[] args) {
        staff staff;
        staff = new staff("Lý Tiểu Minh ", 50000000 ," 87 hồ ngọc lãm phường ạn lạc quận bình tân " ," dev ","16/05/2002");

        System.out.println ("Tên nhân viên: " + staff.tenNhanvien);
        System.out.println ("Địa chỉ: " + staff.diaChi);
        System.out.println ("Bộ phận làm việc: " + staff.boPhanlamviec);
        System.out.println ("Lương của NV (USD): " + staff.luong + "vnd");
        System.out.println ("Ngày sinh: " + staff.ngaysinh);
    }
    
}
