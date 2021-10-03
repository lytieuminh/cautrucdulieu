package com.minhlt2004110044.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class baitapmang_xetestdrive {
    public static void main(String[] args) {

        ArrayList<baitapmang_xe> xeList = new ArrayList<baitapmang_xe>(); 


        Scanner varInput = new Scanner(System.in);

        
        for(int i = 0; i < 2; i++){
            System.out.println(" xe thứ "+ (i+1));

            System.out.println(" tên chủ xe ");
            String tenChuXe = varInput.nextLine();

            System.out.println("hãng sản xuất");
            String hangSanxuat = varInput.nextLine();

            System.out.println(" dòng xe");
            String dongxe = varInput.nextLine();

            System.out.println(" giấy phép ");
            String giayPhep = varInput.nextLine();

            System.out.println(" dung tích xăng ");
            double dungTichXang = varInput.nextDouble();
            varInput.nextLine();

            xeList.add(new baitapmang_xe(tenChuXe,hangSanxuat,dongxe,giayPhep,dungTichXang));
        } 
        System.out.println("=======in danh sách sách sau khi nhập========");
        for ( baitapmang_xe baitapmang_xe : xeList ){
            baitapmang_xe.inthongtin();
            
        }

        System.out.println("=======số lượng xe ta có ========");
        System.out.println(xeList.size());


        System.out.println(" nhập sách thứ 3 ");

        System.out.println(" tên chủ xe ");
        String tenChuXe = varInput.nextLine();

        System.out.println("hãng sản xuất");
        String hangSanxuat = varInput.nextLine();

        System.out.println(" dòng xe");
        String dongxe = varInput.nextLine();

        System.out.println(" giấy phép ");
        String giayPhep = varInput.nextLine();

        System.out.println(" dung tích xăng ");
        double dungTichXang = varInput.nextDouble();
        varInput.nextLine();

        var xethu3 = new baitapmang_xe(tenChuXe,hangSanxuat,dongxe,giayPhep,dungTichXang);
        xeList.add(xethu3);

        System.out.println("=======số lượng xe ta có========");
        System.out.println(xeList.size());
        
    
        System.out.println("======= xe mà bạn muốn xóa là khỏi danh sách ========");
        int xemuonxoa = varInput.nextInt();
        xeList.remove(xemuonxoa-1);
        varInput.close();
        for ( baitapmang_xe baitapmang_xe : xeList ){
            baitapmang_xe.inthongtin();
        
        }
    }
}


