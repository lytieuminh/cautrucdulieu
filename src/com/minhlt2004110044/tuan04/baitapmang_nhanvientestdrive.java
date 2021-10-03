package com.minhlt2004110044.tuan04;
import java.util.Scanner;
import java.util.ArrayList;
public class baitapmang_nhanvientestdrive {
    public static void main(String[] args) {

        ArrayList<baitapmang_nhanvien> nhanvienList = new ArrayList<baitapmang_nhanvien>(); 


        Scanner varInput = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++){
            System.out.println(" tên nhân viên thứ "+ (i+1));

            System.out.println("tên nhân viên");
            String tenNhanvien = varInput.nextLine();
           
            System.out.println(" tiền lương 1 tháng");
            int luong = varInput.nextInt();
            varInput.nextLine();

            System.out.println("địa chỉ");
            String diaChi = varInput.nextLine();

            System.out.println("bộ phận làm việc");
            String boPhanlamviec = varInput.nextLine();

            System.out.println(" ngày sinh");
            String ngaysinh = varInput.nextLine();


            nhanvienList.add(new baitapmang_nhanvien(tenNhanvien,luong,diaChi,boPhanlamviec,ngaysinh));
        } 
        System.out.println("=======in danh sách nhân viên sau khi nhập========");
        for ( baitapmang_nhanvien baitapmang_nhanvien : nhanvienList ){
            baitapmang_nhanvien.inthongtin();
            
        }

        System.out.println("=======số lượng nhân viên là========");
        System.out.println(nhanvienList.size());


        System.out.println(" nhập nhân viên thứ 3 " );

   
            System.out.println("tên nhân viên");
            String tenNhanvien = varInput.nextLine();
           
            System.out.println(" tiền lương 1 tháng");
            int luong = varInput.nextInt();
            varInput.nextLine();

            System.out.println("địa chỉ");
            String diaChi = varInput.nextLine();

            System.out.println("bộ phận làm việc");
            String boPhanlamviec = varInput.nextLine();

            System.out.println(" ngày sinh");
            String ngaysinh = varInput.nextLine();

        var nhanvienthu3 = new baitapmang_nhanvien(tenNhanvien,luong,diaChi,boPhanlamviec,ngaysinh);
        nhanvienList.add(nhanvienthu3);

        System.out.println("=======số nhân viên là========");
        System.out.println(nhanvienList.size());
        
    
        System.out.println("======= nhân viên mà bạn muốn đuổi là nhân viên  số ========");
        int nhanvienbiduoi = varInput.nextInt();
        nhanvienList.remove(nhanvienbiduoi-1);
        varInput.close();
        for ( baitapmang_nhanvien baitapmang_nhanvien : nhanvienList ){
            baitapmang_nhanvien.inthongtin();
        
        }
    }
}

