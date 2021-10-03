package com.minhlt2004110044.tuan04;
import java.util.Scanner;
import java.util.ArrayList;

public class baitapmang_maytinhtestdrive {
    
    public static void main(String[] args) {

        ArrayList<baitapmang_maytinh> maytinhList = new ArrayList<baitapmang_maytinh>(); 


        Scanner varInput = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++){
            System.out.println(" tên máy tính thứ "+ (i+1));

            System.out.println("nhà sản xuất ");
            String nhasanxuat = varInput.nextLine();
           
            System.out.println(" năm sản xuất ");
            String namsanxuat = varInput.nextLine();

            System.out.println("hệ điều hành ");
            String hedieuhanh = varInput.nextLine();

            System.out.println("ram");
            String ram = varInput.nextLine();

            System.out.println(" cpu ");
            String cpu = varInput.nextLine();

            System.out.println(" giá máy ");
            Double giamay = varInput.nextDouble();
            varInput.nextLine();

            System.out.println(" năm bảo hành ");
            String nambaohanh = varInput.nextLine();

            maytinhList.add(new baitapmang_maytinh(nhasanxuat,namsanxuat,hedieuhanh,ram,cpu,giamay,nambaohanh));
        } 
        System.out.println("=======in danh sách nhân viên sau khi nhập========");
        for ( baitapmang_maytinh baitapmang_maytinh : maytinhList ){
            baitapmang_maytinh.inthongtin();
            
        }

        System.out.println("=======số lượng máy tính là========");
        System.out.println(maytinhList.size());


        System.out.println(" nhập máy tính thứ 3 " );

        System.out.println("nhà sản xuất ");
        String nhasanxuat = varInput.nextLine();
       
        System.out.println(" năm sản xuất ");
        String namsanxuat = varInput.nextLine();

        System.out.println("hệ điều hành ");
        String hedieuhanh = varInput.nextLine();

        System.out.println("ram");
        String ram = varInput.nextLine();

        System.out.println(" cpu ");
        String cpu = varInput.nextLine();

        System.out.println(" giá máy ");
        Double giamay = varInput.nextDouble();
        varInput.nextLine();

        System.out.println(" năm bảo hành ");
        String nambaohanh = varInput.nextLine();

        var maytinhthu3 = new baitapmang_maytinh(nhasanxuat,namsanxuat,hedieuhanh,ram,cpu,giamay,nambaohanh);
        maytinhList.add(maytinhthu3);

        System.out.println("=======số máy tính là========");
        System.out.println(maytinhList.size());
        
    
        System.out.println("======= bạn muốn xóa máy tính thứ mấy ========");
        int maytinhbixoa = varInput.nextInt();
        maytinhList.remove(maytinhbixoa-1);
        varInput.close();
        for ( baitapmang_maytinh baitapmang_maytinh : maytinhList ){
            baitapmang_maytinh.inthongtin();
        
        }
    }
}


    