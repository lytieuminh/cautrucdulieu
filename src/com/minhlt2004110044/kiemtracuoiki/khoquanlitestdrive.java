package com.minhlt2004110044.kiemtracuoiki;

import java.util.Scanner;

public class khoquanlitestdrive {
    public static void main(String[] args) {
        khoquanli khoquanli = new khoquanli();
        sanpham sanpham1 = new sanpham("thuc pham" , "T1", "tao do", 15.023d, 35 );
        sanpham sanpham2 = new sanpham("thuc pham" , "T2", "tao xanh", 12.063d, 32 );
        sanpham sanpham3 = new sanpham("thuc pham" , "T3", "tao vang", 23.023d, 38 );
        sanpham sanpham4 = new sanpham("thuc pham" , "T4", "tao luc", 33.013d, 39 );
        sanpham sanpham5 = new sanpham("thuc pham" , "T5", "tao lam", 43.023d, 60 );
        sanpham sanpham6 = new sanpham("thuc pham" , "T6", "tao tram", 13.003d, 62 );
        sanpham sanpham7 = new sanpham("thuc pham" , "T7", "tao tim", 36.120d, 42 );
        sanpham sanpham8 = new sanpham("sanh su" , "BT1", "bot giat OMO", 120.000d, 120 );
        sanpham sanpham9 = new sanpham("sanh su" , "BT2", "bot giat Aba", 144.000d, 135 );
        sanpham sanpham10 = new sanpham("sanh su" , "BT3", "bot giat Ariel", 120.000d, 123 );
        sanpham sanpham11 = new sanpham("sanh su" , "BT4", "bot giat Tide", 95.000d, 140 );
        sanpham sanpham12 = new sanpham("sanh su" , "BT5", "bot giat Surf", 110.000d, 150 );
        sanpham sanpham13 = new sanpham("sanh su" , "BT6", "bot giat blue river", 113.000d, 110 );
        sanpham sanpham14 = new sanpham("sanh su" , "BT7", "bot giat lix ", 142.000d, 166 );
        sanpham sanpham15 = new sanpham("sanh su" , "BT8", "bot giat viso", 155.000d, 123 );
        sanpham sanpham16 = new sanpham("dien may" , "ML1", "may lanh LG", 122.000d, 176 );
        sanpham sanpham17 = new sanpham("dien may" , "ML2", "may lanh Toshiba", 115.000d, 194 );
        sanpham sanpham18 = new sanpham("dien may" , "ML3", "may lanh honda ", 120.000d, 142 );
        sanpham sanpham19 = new sanpham("dien may" , "ML4", "may lanh yamaha ", 123.000d, 150 );
        sanpham sanpham20 = new sanpham("dien may" , "Litlleboy", "may lanh Hiroshima", 120.000d, 1 );
        khoquanli.addHead(sanpham1);
        khoquanli.addHead(sanpham2);
        khoquanli.addHead(sanpham3);
        khoquanli.addHead(sanpham4);
        khoquanli.addHead(sanpham5);
        khoquanli.addHead(sanpham6);
        khoquanli.addHead(sanpham7);
        khoquanli.addHead(sanpham8);
        khoquanli.addHead(sanpham9);
        khoquanli.addHead(sanpham10);
        khoquanli.addHead(sanpham11);
        khoquanli.addHead(sanpham12);
        khoquanli.addHead(sanpham13);
        khoquanli.addHead(sanpham14);
        khoquanli.addHead(sanpham15);
        khoquanli.addHead(sanpham16);
        khoquanli.addHead(sanpham17);
        khoquanli.addHead(sanpham18);
        khoquanli.addHead(sanpham19);
        khoquanli.addHead(sanpham20);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=====================MENU======================");
            System.out.println(">>1. th??m s???n ph???m v??o trong kho .");
            System.out.println(">>2. x??a s???n ph???m trong kho.");
            System.out.println(">>3. s???a d??? li???u s???n ph???m trong kho.");
            System.out.println(">>4. xem s???n ph???m c?? trong kho.");
            System.out.println(">>5. t??m ki???m s???n ph???m c?? trong kho.");
            System.out.println(">>6. s???p x???p s???n ph???m theo h?????ng t??ng d???n.");
            System.out.println(">>7. s???p x???p s???n ph???m theo h?????ng gi???m d???n.");
            System.out.println(">>8. th???ng k?? s???n ph???m c?? trong kho.");
            System.out.println(">>9. K???t th??c.");
            System.out.println("===============================================");
            System.out.print("Ch???n ch???c n??ng: ");
            int key = scanner.nextInt();
            scanner.nextLine();
            switch(key){
                case 1:
                    System.out.println("B???n ch???n ch???c n??ng th??? 1 .");
                    khoquanli.nhapsanpham();
                    break;
                case 2:
                    System.out.println("B???n ch???n ch???c n??ng th??? 2 .");
                    System.out.println("============ x??a s???n ph???m ================");
                    System.out.println(">>1 x??a s???n ph???m theo vi tr?? . ");
                    System.out.println(">>2 x??a s???n ph???m theo ID . ");
                    System.out.println(">>3 tr??? v??? menu . ");
                    System.out.println("==========================================");
                    System.out.print("Ch???n ch???c n??ng: ");
                    int key2 = scanner.nextInt();
                    switch(key2){
                        case 1 :
                            khoquanli.xoasanpham();
                            scanner.nextLine();
                            break;
                        case 2 :
                            khoquanli.xoasanphamtheoid();
                            scanner.nextLine();
                            break;
                        case 3 :
                            scanner.nextLine();
                            break; 
                        
                        default:
                            System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                            scanner.nextLine();
                            break; 
                    }               
                        break;
                case 3:
                    System.out.println("B???n ch???n ch???c n??ng th??? 3 .");
                    System.out.println("============ s???a s???n ph???m ================");
                    System.out.println(">>1 s???a s???n ph???m theo vi tr?? . ");
                    System.out.println(">>2 s???a s???n ph???m theo ID . ");
                    System.out.println(">>3 tr??? v??? menu . ");
                    System.out.println("==========================================");
                    System.out.print("Ch???n ch???c n??ng: ");
                    int key3 = scanner.nextInt();
                    switch(key3){
                        case 1 :
                            khoquanli.suasanpham();
                            scanner.nextLine();
                            break;
                        case 2 :
                            khoquanli.suasanphamtheoID();
                            scanner.nextLine();
                            break;
                        case 3 :
                            scanner.nextLine();
                            break; 
                            
                        default:
                            System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                            scanner.nextLine();
                            break; 
                    }               
                        break;

                case 4:
                    System.out.println("B???n ch???n ch???c n??ng th??? 4 .");
                    khoquanli.inthongtin();
                    break;
                case 5:
                    System.out.println("B???n ch???n ch???c n??ng th??? 5 .");
                    System.out.println("============ t??m ki???m ================");
                    System.out.println(">>1 t??m ki???m theo lo???i . ");
                    System.out.println(">>2 t??m ki???m theo gi?? . ");
                    System.out.println(">>3 t??m ki???m theo gi?? trong kho???n t??? ( A ... B ). ");
                    System.out.println(">>4 tr??? v??? menu . ");
                    System.out.println("=======================================");
                    System.out.print("Ch???n ch???c n??ng: ");
                    int key5 = scanner.nextInt();
                    switch(key5){
                        case 1:   
                            khoquanli.timtheoloai();  
                            scanner.nextLine();               
                            break;
                        case 2:
                            khoquanli.timtheogia();
                            scanner.nextLine();
                            break;
                        case 3:
                            khoquanli.timgiatuAdenB();
                            scanner.nextLine();
                            break;
                        case 4: 
                            scanner.nextLine();
                            break;

                        default:
                            System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                            scanner.nextLine();
                            break; 
                    }            
                        break;
                case 6:
                    System.out.println("B???n ch???n ch???c n??ng th??? 6 .");   
                    System.out.println("============ T??ng d???n ================");
                    System.out.println(">>1 s???p x???p t??ng d???n theo gi?? . ");
                    System.out.println(">>2 s???p x???p t??ng d???n theo lo???i theo gi??. ");
                    System.out.println(">>3 tr??? v??? menu . ");
                    System.out.println("=======================================");
                    System.out.print("Ch???n ch???c n??ng: ");
                    int key6 = scanner.nextInt();
                    switch(key6){
                        case 1:   
                            khoquanli.tangdantheogia();
                            scanner.nextLine();
                            break;
                        case 2:
                            khoquanli.tangdantheoloaivatheogia();
                            scanner.nextLine();
                            break;
                        case 3: 
                            scanner.nextLine();
                            break;

                        default:
                            System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                            scanner.nextLine();
                            break; 
                    }            
                        break;
                    
                case 7:
                System.out.println("B???n ch???n ch???c n??ng th??? 7 .");   
                System.out.println("============ Gi???m d???n ================");
                System.out.println(">>1 s???p x???p gi???m d???n theo gi?? . ");
                System.out.println(">>2 s???p x???p gi???m d???n theo lo???i theo gi??. ");
                System.out.println(">>3 tr??? v??? menu . ");
                System.out.println("=======================================");
                System.out.print("Ch???n ch???c n??ng: ");
                int key7 = scanner.nextInt();
                switch(key7){
                    case 1:   
                        khoquanli.giamdantheogia(); 
                        scanner.nextLine();               
                        break;
                    case 2:
                        khoquanli.giamdantheoloaivatheogia();
                        scanner.nextLine();
                        break;
                    case 3: 
                        scanner.nextLine(); 
                        break;
                    
                    default:
                        System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                        scanner.nextLine();
                        break;    
                }
                    break;
                
                case 8:
                    System.out.println("B???n ch???n ch???c n??ng th??? 8 .");
                    System.out.println("============ th???ng k?? ================");
                    System.out.println(">>1 t???ng s??? l?????ng h??ng h??a . ");
                    System.out.println(">>2 t???ng gi?? tr??? nh???p kho . ");
                    System.out.println(">>3 s??? l?????ng t???ng lo???i h??ng . ");
                    System.out.println(">>4 tr??? v??? menu . ");
                    System.out.println("============================");
                    System.out.print("Ch???n ch???c n??ng: ");
                    int key8 = scanner.nextInt();
                    switch(key8){
                        case 1:   
                            khoquanli.tongsoluonghanghoa();   
                            scanner.nextLine();  
                            break;
                        case 2:
                            khoquanli.tonggiatrihanghoa();
                            scanner.nextLine();
                            break;
                        case 3: 
                            khoquanli.soluongtungloai();
                            scanner.nextLine();
                            break;
                        case 4:       
                            scanner.nextLine();
                            break;
                        
                        default:
                            System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                            scanner.nextLine();
                            break;    
                    }      
                        break;    
                case 9:
                    System.out.println(" k???t th??c! T???m bi???t!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println(" ch???c n??ng b???n ch???n hi???n kh??ng t???n t???i");
                    break;
            }

                    System.out.print("Quay tr??? v??? MENU l???a ch???n ?(y/n): ");
                }   
                
                while(scanner.nextLine().equals("y"));
            }    
        }             
