package com.minhlt2004110044.kiemtragiuaki;
    import java.util.ArrayList;
    import java.util.Scanner;

    
public class appletestdrive {
    public static void main(String[] args) {
        do {
            Menu();
            System.out.print("Quay trở về MENU lựa chọn ?(y/n): ");
        } while(scanner.nextLine().equals("y"));
    }  

    static Scanner scanner = new Scanner(System.in);
    static ArrayList <apple> list = new ArrayList<apple>();
    static void Menu(){ 

        System.out.println("=====================MENU======================");
        System.out.println(">>1. Nhập danh sách táo trong kho .");
        System.out.println(">>2. Xuất danh sách táo vừa nhập.");
        System.out.println(">>3. Tìm táo theo màu");
        System.out.println(">>4. Kết thúc.");
        System.out.print("Chọn chức năng: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        switch(key){
            case 1:
                System.out.println("Bạn chọn chức năng Nhập danh táo trong kho !");
                nhap();
                break;
            case 2:
                System.out.println("Bạn chọn chức năng Xuất danh sách vừa nhập !");
                xuat();
                break;
            case 3:
                System.out.println("Bạn chọn chức năng Tìm táo theo màu sắc !");
                timtheomau();
                break;
            case 4:
                System.out.println(" kết thúc! Tạm biệt!");
                System.exit(0);
                break;
        }
    }

    static void nhap(){
        while(true){

            System.out.print("Nhập tên id : ");
            String id = scanner.nextLine();

            System.out.print("màu sác : ");
            String mausac = scanner.nextLine();

            System.out.print("khoi luong : ");
            int khoiluong = scanner.nextInt();

            apple x = new apple(id,khoiluong,mausac);
            list.add(x);

            System.out.print("Nhập thêm (y/n)?: ");
            scanner.nextLine();

            if(scanner.nextLine().equals("n")) {
                break;
            }

        }
    }
    static void xuat(){
        int demso = 1;
        for (apple a : list){
            System.out.println("Xuất thông tin của táo thứ " + demso);
            System.out.println(" id táo : " + a.id);
            System.out.println(" màu sắc táo : " + a.mausac);
            System.out.println(" khối lượng táo : " +a.khoiluong);
            demso ++;
        }    
    }

    static void timtheomau(){
        System.out.print("Nhập máu sắc bạn muốn tìm : ");
        String mau = scanner.nextLine();

        boolean ketqua = false;
        int demso = 1;
        for (apple a : list){
            if (mau.equals(a.mausac)) {
                System.out.println("Xuất thông tin của táo trùng màu thứ " + demso);
                System.out.println(" id táo : " + a.id);
                System.out.println(" màu sắc táo : " + a.mausac);
                System.out.println(" khối lượng táo : " +a.khoiluong);
                ketqua = true;
            }
        }
        if(ketqua == false) {
            System.out.println("không tìm thấy kết quả !");
        }
    }  
}

