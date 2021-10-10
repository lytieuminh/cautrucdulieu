package com.minhlt2004110044.tuan05;
    
    import java.util.ArrayList;
    import java.util.Scanner;
    import java.util.Collections;
    

    public class lab4bai2 {

        public static void main(String[] args) {
            do {
                Menu();
                System.out.print("Quay trở về MENU lựa chọn ?(y/n): ");
            } while(scanner.nextLine().equals("y"));
        }  

        static Scanner scanner = new Scanner(System.in);
        static ArrayList <String> list = new ArrayList<String>();
        static void Menu(){
            System.out.println("=====================MENU======================");
            System.out.println(">>1. Nhập danh sách sản phẩm .");
            System.out.println(">>2. Sắp xếp giảm dần theo giá và xuất ra màn hình.");
            System.out.println(">>3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.");
            System.out.println(">>4. Xuất giá trung bình của các sản phẩm .");
            System.out.println(">>5. Kết thúc.");
            System.out.print("Chọn chức năng: ");
            int key = scanner.nextInt();
            scanner.nextLine();
            switch(key){
                case 1:
                    System.out.println("Bạn chọn chức năng Nhập danh sách họ và tên !");
                    nhap();
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng Xuất danh sách vừa nhập !");
                    xuat();
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng Xuất danh sách ngẫu nhiên !");
                    xuatNgauNhien();
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng Sắp xếp giảm dần và xuất danh sách !");
                    sapXep();
                    break;
                case 5:
                    System.out.println(" kết thúc! Tạm biệt!");
                    System.exit(0);
                    break;
            }
        }
        static void nhap(){
            while(true){
                System.out.print("Nhập họ và tên: ");
                String x = scanner.nextLine();
                list.add(x);
                System.out.print("Nhập giá tiền: ");
                String m = scanner.nextLine();
                list.add(m);
                System.out.print("Nhập thêm (Y/N)?: ");
                if(scanner.nextLine().equals("N"))
                    break;
            }
        }
        static void xuat(){
            for (String a : list){
                System.out.println("Họ và tên: " +a);
            }    
        }
        static void xuatNgauNhien(){
            Collections.shuffle(list);
            xuat();
        }
        static void sapXep(){
            Collections.sort(list);
            Collections.reverse(list);
            xuat();
        }
        static void xoa(){

            for (String a : list){
                System.out.println("Họ và tên: " +a);
            }    


            System.out.print("Nhập tên cần xoá: ");
            String name = scanner.nextLine();
            for (String a : list) {
                if(a.equals(name)){
                    list.remove(a);
                    System.out.println("Đã xoá!");
                    break;
                }
            }
        }
        
    }