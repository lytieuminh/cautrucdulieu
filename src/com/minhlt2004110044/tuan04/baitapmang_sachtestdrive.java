package com.minhlt2004110044.tuan04;
import java.util.Scanner;
import java.util.ArrayList;
public class baitapmang_sachtestdrive {
    public static void main(String[] args) {

        ArrayList<baitapmang_sach> sachList = new ArrayList<baitapmang_sach>(); 


        Scanner varInput = new Scanner(System.in);

        
        for(int i = 0; i < 2; i++){
            System.out.println(" nhập sách thứ "+ (i+1));

            System.out.println("tên sách");
            String tensach = varInput.nextLine();

            System.out.println("nhà xuất bản");
            String nhaXuatban = varInput.nextLine();

            System.out.println("năm xuất bản");
            int namXuatban = varInput.nextInt();

            System.out.println("giá bán");
            Double giaBan = varInput.nextDouble();

            System.out.println("số lượng");
            int soLuong = varInput.nextInt();
            varInput.nextLine();

            System.out.println("thể loại ");
            String theloai = varInput.nextLine();

            sachList.add(new baitapmang_sach(tensach,nhaXuatban,namXuatban,giaBan,soLuong,theloai));
        } 
        System.out.println("=======in danh sách sách sau khi nhập========");
        for ( baitapmang_sach baitapmang_sach : sachList ){
            baitapmang_sach.inthongtin();
            
        }

        System.out.println("=======số lượng sách là========");
        System.out.println(sachList.size());


        System.out.println(" nhập sách thứ 3 ");

        System.out.println("tên sách");
        String tensach = varInput.nextLine();

        System.out.println("nhà xuất bản");
        String nhaXuatban = varInput.nextLine();

        System.out.println("năm xuất bản");
        int namXuatban = varInput.nextInt();

        System.out.println("giá bán");
        Double giaBan = varInput.nextDouble();

        System.out.println("số lượng");
        int soLuong = varInput.nextInt();
        varInput.nextLine();

        System.out.println("thể loại ");
        String theloai = varInput.nextLine();
        var sachthu3 = new baitapmang_sach(tensach,nhaXuatban,namXuatban,giaBan,soLuong,theloai);
        sachList.add(sachthu3);

        System.out.println("=======số lượng sách là========");
        System.out.println(sachList.size());
        
    
        System.out.println("======= sách mà bạn muốn xóa là sách số ========");
        int sachmuonxoa = varInput.nextInt();
        sachList.remove(sachmuonxoa-1);
        varInput.close();
        for ( baitapmang_sach baitapmang_sach : sachList ){
            baitapmang_sach.inthongtin();
        
        }
    }
}
