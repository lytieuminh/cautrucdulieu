package com.minhlt2004110044.tuan08;
import java.util.Scanner;
import java.util.Stack;
public class stacksachtestdrive {
           
    static Scanner scanner = new Scanner(System.in);

        
        
    public static void nhap(Stack<sach> sach){

        while(true){
        
        System.out.print(" nhập tên sách : ");
        String tensach = scanner.nextLine();

        System.out.print(" nhập giá bán của sách : ");
        Double giaBan = scanner.nextDouble();

        System.out.print(" nhập số lượng sách ");
        Double soLuong = scanner.nextDouble();
        scanner.nextLine();
        sach x = new sach(tensach,giaBan,soLuong);
        sach.push(x);
        
        System.out.print("Nhập thêm (y/n)?: ");
       
        
        if(scanner.nextLine().equals("n")) {
        break;
        }
    }
}    

public static void lay(Stack<sach> sach){
    sach accessedsach = sach.peek();
    System.out.println(" tên sách đầu hàng : " + accessedsach.tensach);
    System.out.println(" giá tiền sách đầu hàng : " + accessedsach.giaBan);
    System.out.println(" số lượng sách đầu hàng : " + accessedsach.soLuong);
}


public static void xoa(Stack<sach> sach){
    while(true){
    sach removedsach = sach.pop();
    System.out.println(" ");
    System.out.println(" tên sách đầu hàng bị xóa " + removedsach.tensach);
    System.out.println(" giá tiền sách đầu hàng bị xóa " + removedsach.giaBan);
    System.out.println(" số lượng sách đầu hàng bị xóa " + removedsach.soLuong);

    System.out.print("Nhập thêm (y/n)?: ");
    
    if(scanner.nextLine().equals("n")) 
    {
    break;
    }
}    
}



public static void main(String[] args) {
    Stack<sach> sach= new Stack<>();
    nhap(sach);
    lay(sach);
    System.out.println(" ");
    System.out.println(" ");
    xoa(sach);
    System.out.println(" kết thúc! Tạm biệt!");
            System.exit(0);
}
}
 
