package com.minhlt200410044.tuan02;
import java.util.Scanner;
public class lab2bai4 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean cont = true;
		do {
            System.out.println("+-----------------------------------+");
            System.out.println("1. giải phương trình bậc 1");
            System.out.println("2. giải phương trình bậc 2");
            System.out.println("3. tính tiền điện ");
            System.out.println("4. thoát ra ");
            System.out.println("+-----------------------------------+");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
            System.out.print("nhập a  "); 
            double a = scanner.nextInt();    
            System.out.print("nhập b: "); 
            double b = scanner.nextInt(); 
            if (a==0){
                if(b==0){
                System.out.println(" phương trình có vô số nghiệm");
                }else{
                    System.out.println(" phương trình vô nghiệm ");
                }
            }else{
            
            System.out.println(" phương trình có nghiệm x = "+ (-b/a));
            }
				break;
			case 2:
            System.out.print("nhập a  "); 
            Float A = scanner.nextFloat();    
            System.out.print("nhập b: "); 
            Float B = scanner.nextFloat(); 
            System.out.print("nhập c: "); 
            Float C = scanner.nextFloat(); 
            if (A == 0) {
                if (B == 0) {
                    System.out.println("Phương trình vô nghiệm!");
                } else {
                    System.out.println("Phương trình có một nghiệm: x =" + (-C / B));
                }
            }
            
            Float delta = B*B - 4*A*C;
            Float x1;
            Float x2;
            
            if (delta > 0) {
                x1 = (float) ((-B + Math.sqrt(delta)) / (2*A));
                x2 = (float) ((-B - Math.sqrt(delta)) / (2*A));
                System.out.println("Phương trình có 2 nghiệm là: x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-B / (2 * A));
                System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
				break;
			case 3:
            System.out.print("nhập số điện sử dụng trong tháng  ");  
            double dien = scanner.nextInt();
            if(dien<50){
            System.out.println(" tiền điện tháng này ="+ dien*1000);
            }else{
            System.out.println(" tiền điện tháng này ="+ 50*1000+(dien-50)*1200);    
            }
				break;
			default:
				System.out.println("Goodbye");
				cont = false;
				break;
			}
		} while (cont);
        scanner.close();
	}
}

