package com.minhlt2004110044.tuan04;

public class baitapmang_xe {
    String tenChuXe;
    String hangSanxuat;
    String dongxe;
    String giayPhep;
    Double dungTichXang;
    int xemuonxoa;
    baitapmang_xe(){

    }
    baitapmang_xe(String tenchuxemoi, String hangsanxuatmoi, String dongxemoi, String giayphepmoi, Double dungtichxangmoi ) {
        tenChuXe = tenchuxemoi;
        hangSanxuat = hangsanxuatmoi;
        dongxe = dongxemoi;
        giayPhep = giayphepmoi;
        dungTichXang = dungtichxangmoi;
    }
    void inthongtin(){
        System.out.println(" tên chủ xe : "+ tenChuXe + " / hãng sản xuất : "+ hangSanxuat + " / dòng xe : "+ dongxe  + " / giấy phép : "+ giayPhep +" / dung tích xăng : "+ dungTichXang + "lít" );  
    }
}



