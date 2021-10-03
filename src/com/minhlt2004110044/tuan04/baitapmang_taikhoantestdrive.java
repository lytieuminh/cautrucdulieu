package com.minhlt2004110044.tuan04;
import java.util.ArrayList;
import java.util.Scanner;
public class baitapmang_taikhoantestdrive {
 
    public static void main(String[] args) {

        ArrayList<baitapmang_taikhoan> taikhoanList = new ArrayList<baitapmang_taikhoan>(); 


        Scanner varInput = new Scanner(System.in);

        
        for(int i = 0; i < 2; i++){
            System.out.println(" tài khoản thứ  "+ (i+1));

            System.out.println(" tên chủ tài khoản ");
            String tenChutaikhoan = varInput.nextLine();

            System.out.println("số tài khoản");
            int sotaikhoan = varInput.nextInt();

            System.out.println(" số dư tài khoản");
            Double sodutaikhoan = varInput.nextDouble();

            varInput.nextLine();

            taikhoanList.add(new baitapmang_taikhoan(tenChutaikhoan,sotaikhoan,sodutaikhoan));
        } 
        System.out.println("=======in danh sách sách sau khi nhập========");
        for ( baitapmang_taikhoan baitapmang_taikhoan : taikhoanList ){
            baitapmang_taikhoan.inthongtin();
            
        }

        System.out.println("=======số tài khoản ta có ========");
        System.out.println(taikhoanList.size());


        System.out.println(" nhập tài khoản thứ 3 ");

    
        System.out.println(" tên chủ tài khoản ");
        String tenChutaikhoan = varInput.nextLine();

        System.out.println("số tài khoản");
        int sotaikhoan = varInput.nextInt();

        System.out.println(" số dư tài khoản");
        Double sodutaikhoan = varInput.nextDouble();

        var taikhoanthu3 = new baitapmang_taikhoan(tenChutaikhoan,sotaikhoan,sodutaikhoan);
        taikhoanList.add(taikhoanthu3);

        System.out.println("=======số tài khoản ta có========");
        System.out.println(taikhoanList.size());
        
    
        System.out.println("======= tài khoản mà bạn muốn xóa là khỏi danh sách ========");
        int taikhoanmuonxoa = varInput.nextInt();
        taikhoanList.remove(taikhoanmuonxoa-1);
        varInput.close();
        for ( baitapmang_taikhoan baitapmang_taikhoan : taikhoanList ){
            baitapmang_taikhoan.inthongtin();
        
        }
    }
}

