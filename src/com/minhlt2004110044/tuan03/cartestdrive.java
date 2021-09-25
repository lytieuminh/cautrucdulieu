package com.minhlt2004110044.tuan03;

public class cartestdrive {
    public static void main(String[] args) {
        car car;
        car = new car("Lý Tiểu Minh", "11111199999","honda", "wave alpha",2.5);

        System.out.println ("Tên chủ xe: " +car.tenChuXe);
        System.out.println ("Số: " +car.giayPhep);
        System.out.println ("Hãng sản xuất: " +car.hangSanxuat);
        System.out.println ("Dòng xe hơi: " +car.dongxe);
        System.out.println ("Dung tích xăng: " +car.dungTichXang + "lít");
    }
    
}
