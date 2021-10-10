package com.minhlt2004110044.tuan04;
    import java.util.Scanner;

    public class lab3bai4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số sinh viên muốn điền vào : ");
            int n = scanner.nextInt();
            String[] thongTinSV = new String[n];
           
            for (int i = 0; i < n; i++){
            
                System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
                System.out.println("Họ và tên : ");
                thongTinSV[i] = new Scanner(System.in).nextLine();
            }
            
            float[] diem = new float[n];
            for (int i = 0; i < n; i++){
                System.out.println("Điểm của sinh viên thứ " + (i + 1) );
                System.out.println("Điểm: ");
                diem[i] = scanner.nextFloat();
            }  


            // selection sort     

            for (int i = 0; i < n; i++) {
                float min = diem[i];
                int minId = i;
                for (int j = i+1; j < n; j++) {
                    if (diem[j] < min) {
                        min = diem[j];
                        minId = j;
                    }
               
                // swapping

                float temp =  diem[i];
                diem[i] = min;
                diem[minId] = temp;
                
            
                String tam_Thongtin;   
                tam_Thongtin = thongTinSV[i];
                thongTinSV[i] = thongTinSV[j];
                thongTinSV[j] = tam_Thongtin ;
            }
        }
            
             System.out.println("===========Danh sách sinh viên đã nhập tăng dần theo điểm==================");
             for (int i = 0; i < n; i++){
                 System.out.println("Tên sinh viên: " + thongTinSV[i]);
                    System.out.println("Điểm :" + diem[i]);
                }



                
                System.out.println("=============Học lực của từng sinh viên==============");
                for(int i=0;i<n;i++) {
                    if(diem[i]<5) {
                        System.out.println("Ten : "+thongTinSV[i]+"\n Diem: "+ diem[i]+"\nHoc Luc: yeu");
                    }
                    if(diem[i]>5 && diem[i]<6.5) {
                        
                        System.out.println("Ten : "+thongTinSV[i]+"\n Diem: "+diem[i]+"\nHoc Luc: trung binh");
                    }
                    if(diem[i]>=6.5 && diem[i]<7.5) {
                        
                        System.out.println("Ten : "+thongTinSV[i]+"\n Diem: "+diem[i]+"\nHoc Luc: kha");
                    }
                    if(diem[i]>=7.5 && diem[i]<9) {
                        
                        System.out.println("Ten : "+thongTinSV[i]+"\n Diem: "+diem[i]+"\nHoc Luc: gioi");
                    }
                    if(diem[i ]>=9) {
                        
                        System.out.println("Ten : "+thongTinSV[i]+"\n Diem: "+diem[i]+"\nHoc Luc: xuat sac");
                        scanner.close();
                    }
                }
            }
    }