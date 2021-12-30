package com.minhlt2004110044.kiemtracuoiki;

import java.util.Scanner;


public class khoquanli {
    
    node head = null;
    node tail = null;

    public khoquanli() {}
    Scanner scanner = new Scanner(System.in);

    // nhập vào đầu danh sách
    void addHead(sanpham data) {
        node newNode = new node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        }else{

            tail.next =newNode;
            tail = newNode;
        }
    }

    // hàm chức năng 1 nhập thông tin sản phẩm 1 vị trí bất kỳ 
    public void nhapsanpham(){
        
        System.out.print("Nhập vị trí bạn muốn thêm vào danh sách: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("=====================================");
        System.out.print(" Nhập loại sản phẩm: ");
        String loai = scanner.nextLine();

        System.out.print(" Nhập ID của sản phẩm: ");
        String id = scanner.nextLine();

        System.out.print(" Nhập tên sản phẩm: ");
        String tensanpham = scanner.nextLine();

        System.out.print(" Nhập giá tiền sản phẩm: ");
        Double giatien = scanner.nextDouble();

        System.out.print(" Nhập số lượng sản phẩm: ");
        int soluong = scanner.nextInt();
        System.out.println("=====================================");

        themNode(new sanpham(loai,id,tensanpham,giatien,soluong),n);

    }

    // 
    void themNode(sanpham data, int vitri) {
        
        node node = new node();
        node.data = data;
        node.next = null;


        if (this.head == null) {
            
            if (vitri != 1) {
                return;
            } else { 
                this.head = node;
            }
        }

        if (head != null && vitri == 1) {
            node.next = this.head;
            this.head = node;
            return;
        }

        node tam = this.head;
        node NutT = null;

        int i  = 1;

        while (i  < vitri) {
            NutT = tam;
            tam = tam.next;

            if (tam == null) {
                break;
            }

            i++;
        }

        node.next = tam;
        NutT.next = node;
    }

    // hàm chức năng 2 xóa thông tin sản phẩm 1 vị trí bất kì 
    void xoasanpham(){
        System.out.print("Nhập vị trí sản phẩm bạn muốn xóa trong danh sách: ");
        int d = scanner.nextInt();
        xoaNode(d);
        
    }

void xoaNode(int vitri) {
    if(head == null) {
        System.out.println(" danh sách rỗng ");
        return;
    }
    if(vitri < 1) {
        System.out.println(" bạn nên chọn vị trí >= 1.");
    } else {
        if (vitri == 1 && head != null) {         
            head = head.next;
            return;
        } else {
            node tam = new node();
            tam = head;
            for(int i = 0; i < vitri - 2; i++) {
                if(tam != null) {
                    tam = tam.next;
                }
            }

            if(tam != null && tam.next != null) {
                tam.next = tam.next.next; 
                return;
            } else {
                System.out.println("bạn nhập vị trí quá số lượng trong danh sách");
            }       
        }
    }
}  

    // xóa sản phẩm theo id
    void xoasanphamtheoid(){
        System.out.print("Nhập ID bạn muốn xóa : ");
        String A = scanner.nextLine();

        if (head == null ){
            System.out.println("không có sản phẩm !!!");
            return;
        }

        node tam = head;

        int dem = 1;
        while ( tam != null ) {
            if( A.equals(tam.data.id)){
                xoaNode(dem);
            }
                dem ++;   
                tam = tam.next;  
        } 
    }

    // hàm chức năng 3 sửa thông tin sản phẩm
    void suasanpham(){
        System.out.print("Nhập vị trí sản phẩm bạn muốn sửa trong danh sách: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        xoaNode(x);
        System.out.println("để sửa vui lòng nhập lại thông tin sản phẩm ");

        System.out.println("=====================================");
        System.out.print(" Nhập loại sản phẩm: ");
        String loai = scanner.nextLine();

        System.out.print(" Nhập ID của sản phẩm: ");
        String id = scanner.nextLine();

        System.out.print(" Nhập tên sản phẩm: ");
        String tensanpham = scanner.nextLine();

        System.out.print(" Nhập giá tiền sản phẩm: ");
        Double giatien = scanner.nextDouble();

        System.out.print(" Nhập số lượng sản phẩm: ");
        int soluong = scanner.nextInt();
        System.out.println("=====================================");

        themNode(new sanpham(loai,id,tensanpham,giatien,soluong),x);
    }
// sửa sản phẩm theo ID
void suasanphamtheoID(){
        System.out.print("Nhập ID của sản phẩm bạn muốn sửa trong danh sách: "); 
        String A = scanner.nextLine(); 

        if (head == null ){
            System.out.println("không có sản phẩm !!!");
            return;
        }

        node tam = head;
        int dem = 1;
        while ( tam != null ){
        if ( A.equals(tam.data.id)){
            xoaNode(dem);
            break;
        }
        tam = tam.next;
        dem++;
    }


System.out.println("để sửa vui lòng nhập lại thông tin sản phẩm ");

System.out.println("=====================================");
System.out.print(" Nhập loại sản phẩm: ");
String loai = scanner.nextLine();

System.out.print(" Nhập ID của sản phẩm: ");
String id = scanner.nextLine();

System.out.print(" Nhập tên sản phẩm: ");
String tensanpham = scanner.nextLine();

System.out.print(" Nhập giá tiền sản phẩm: ");
Double giatien = scanner.nextDouble();

System.out.print(" Nhập số lượng sản phẩm: ");
int soluong = scanner.nextInt();
System.out.println("=====================================");

themNode(new sanpham(loai,id,tensanpham,giatien,soluong),dem);
}      


// hàm chức năng 4 in thông tin sản phẩm
    void inthongtin(){
        node tam = head;

        if(head == null){
            System.out.println("không có sản phẩm !!!");
            return;
        }
        System.out.println("========Các sản phẩm trong danh sách=========");
        
        while(tam != null){
            System.out.println("===========================");
            System.out.println("loại sản phẩm : " + tam.data.loai);
            System.out.println("ID của sản phẩm : " + tam.data.id);
            System.out.println("tên sản phẩm : " + tam.data.tensanpham);
            System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
            System.out.println("số lượng sản phẩm : " + tam.data.soluong);
            tam = tam.next;
        }
        System.out.println();
    }


// chức năng thứ 5 tìm kiểm sản phẩm theo
// theo loại 
void timtheoloai(){
            System.out.print("Nhập loại bạn muốn tìm : ");
            String loai = scanner.nextLine();
            node tam = head;
            boolean ketqua = false;  
            System.out.println("======== các sản phẩm cùng loại =========");  
            while ( tam != null){
            while (loai.equals(tam.data.loai)){

            System.out.println("===========================");
            System.out.println("loại sản phẩm : " + tam.data.loai);
            System.out.println("ID của sản phẩm : " + tam.data.id);
            System.out.println("tên sản phẩm : " + tam.data.tensanpham);
            System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
            System.out.println("số lượng sản phẩm : " + tam.data.soluong);

            
            ketqua=true;
            
            break;
        
        }
        tam = tam.next;
    }
    if( ketqua == false){
        System.out.println("không tìm thấy kết quả !");
        }
    }


// theo giá
void timtheogia(){
    System.out.print("Nhập giá bạn muốn tìm : ");
            Double gia = scanner.nextDouble();
            node tam = head;
            boolean ketqua = false;  
            System.out.println("======== các sản phẩm cùng giá =========");  
        while ( tam != null){
            while (gia ==tam.data.giatien){
            System.out.println("===========================");
            System.out.println("loại sản phẩm : " + tam.data.loai);
            System.out.println("ID của sản phẩm : " + tam.data.id);
            System.out.println("tên sản phẩm : " + tam.data.tensanpham);
            System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
            System.out.println("Nhập số lượng sản phẩm : " + tam.data.soluong);
            ketqua=true;
            
            break;
        }
        tam = tam.next;
    }
    if( ketqua == false){
        System.out.println("không tìm thấy kết quả !");
        }
    }
// tìm kiếm trong khoản từ giá A đến giá B 
void timgiatuAdenB(){
    System.out.println(" nhập giá cần tìm trong khoản ( A ... B ) ! ");
    System.out.println(" nhập giá trị A ");
    Double A = scanner.nextDouble();
    System.out.println(" nhập giá trị B ");
    Double B = scanner.nextDouble();
    node tam = head;
    boolean ketqua = false;  
    System.out.println("======== các sản phẩm trong khoản giá "+ A + " đến " +  B  +" =========");  
    while ( tam != null){
        if ( A < B){
            while ( A<tam.data.giatien && B > tam.data.giatien){
                System.out.println("===========================");
                System.out.println("loại sản phẩm : " + tam.data.loai);
                System.out.println("ID của sản phẩm : " + tam.data.id);
                System.out.println("tên sản phẩm : " + tam.data.tensanpham);
                System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
                System.out.println("Nhập số lượng sản phẩm : " + tam.data.soluong);  
                ketqua=true; 
                break;
            }
        }
        if ( A > B){
            while ( A>tam.data.giatien && B < tam.data.giatien){
                System.out.println("===========================");
                System.out.println("loại sản phẩm : " + tam.data.loai);
                System.out.println("ID của sản phẩm : " + tam.data.id);
                System.out.println("tên sản phẩm : " + tam.data.tensanpham);
                System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
                System.out.println("Nhập số lượng sản phẩm : " + tam.data.soluong);  
                ketqua=true; 
                break;
            }
        }
        if ( A == B){
            while ( A==tam.data.giatien){
                System.out.println("===========================");
                System.out.println("loại sản phẩm : " + tam.data.loai);
                System.out.println("ID của sản phẩm : " + tam.data.id);
                System.out.println("tên sản phẩm : " + tam.data.tensanpham);
                System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
                System.out.println("Nhập số lượng sản phẩm : " + tam.data.soluong);  
                ketqua=true; 
                break;
            }
        }
        tam = tam.next;
    }
    if( ketqua == false){
        System.out.println("không tìm thấy kết quả !");
        }
    }


// chức năng thứ 6 sắp tăng dần ( theo bubble )
//tăng dần theo giá và theo loại

void tangdantheoloaivatheogia(){
    if (head != null) {

            node tam = null;
      
            int status = 0;
            do {
              tam = head;
              status = 0; 
              while (tam!= null && tam.next != null) {
                if (tam.data.giatien > tam.next.data.giatien) {
                    
                      status = 1;
                      tam.data.giatien = tam.data.giatien + tam.next.data.giatien;
      
                      tam.next.data.giatien = tam.data.giatien - tam.next.data.giatien;
      
                      tam.data.giatien = tam.data.giatien - tam.next.data.giatien;
                    }
                    tam = tam.next;
                }
              
            } while (status == 1);
      
        } else {
        System.out.println("không tìm thấy kết quả !");
    }
            System.out.print("Nhập loại bạn muốn tìm : ");
            String loai = scanner.nextLine();
            node tam = head;
            boolean ketqua = false;  
            System.out.println("======== các sản phẩm cùng loại =========");  
            while ( tam != null){
            while (loai.equals(tam.data.loai)){

            System.out.println("===========================");
            System.out.println("loại sản phẩm : " + tam.data.loai);
            System.out.println("ID của sản phẩm : " + tam.data.id);
            System.out.println("tên sản phẩm : " + tam.data.tensanpham);
            System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
            System.out.println("số lượng sản phẩm : " + tam.data.soluong);

            
            ketqua=true;
            
            break;
        
        }
        tam = tam.next;
    }
    if( ketqua == false){
        System.out.println("không tìm thấy kết quả !");
        }
}
//tăng dần theo giá 
void tangdantheogia(){
    if (head != null) {

        node tam = null;
  
        int status = 0;
        do {
          tam = head;
          status = 0;
          while (tam!= null && tam.next != null) {
            
            if (tam.data.giatien > tam.next.data.giatien) {
                
                  status = 1;
                  tam.data.giatien = tam.data.giatien + tam.next.data.giatien;
  
                  tam.next.data.giatien = tam.data.giatien - tam.next.data.giatien;
  
                  tam.data.giatien = tam.data.giatien - tam.next.data.giatien;
                }
                tam = tam.next;
            }
  
        } while (status == 1);
  
    } else {
    System.out.println("không tìm thấy kết quả !");
}
inthongtin();
}

// chức năng thứ 7 sắp giảm dần ( theo bubble )
//giảm dần theo giá

void giamdantheogia(){
    if (head != null) {

        node tam = null;
  
        int A = 0;
        do {
          tam = head;
          A = 0;
          while (tam!= null && tam.next != null) {
  
            if (tam.data.giatien < tam.next.data.giatien) {
                
                  A = 1;
                  tam.data.giatien = tam.data.giatien + tam.next.data.giatien;
  
                  tam.next.data.giatien = tam.data.giatien - tam.next.data.giatien;
  
                  tam.data.giatien = tam.data.giatien - tam.next.data.giatien;
                }
                tam = tam.next;
            }
  
        } while (A == 1);
  
    } else {
    System.out.println("không tìm thấy kết quả !");
}
inthongtin();
}
//giảm dần theo loại theo giá 
void giamdantheoloaivatheogia(){
    if (head != null) {

            node tam = null;
      
            int status = 0;
            do {
              tam = head;
              status = 0; 
              while (tam!= null && tam.next != null) {
                if (tam.data.giatien < tam.next.data.giatien) {
                    
                      status = 1;
                      tam.data.giatien = tam.data.giatien + tam.next.data.giatien;
      
                      tam.next.data.giatien = tam.data.giatien - tam.next.data.giatien;
      
                      tam.data.giatien = tam.data.giatien - tam.next.data.giatien;
                    }
                    tam = tam.next;
                }
              
            } while (status == 1);
      
        } else {
        System.out.println("không tìm thấy kết quả !");
    }
            System.out.print("Nhập loại bạn muốn tìm : ");
            String loai = scanner.nextLine();
            node tam = head;
            boolean ketqua = false;  
            System.out.println("======== các sản phẩm cùng loại =========");  
            while ( tam != null){
            while (loai.equals(tam.data.loai)){

            System.out.println("===========================");
            System.out.println("loại sản phẩm : " + tam.data.loai);
            System.out.println("ID của sản phẩm : " + tam.data.id);
            System.out.println("tên sản phẩm : " + tam.data.tensanpham);
            System.out.println("giá tiền sản phẩm: " + tam.data.giatien);
            System.out.println("số lượng sản phẩm : " + tam.data.soluong);

            
            ketqua=true;
            
            break;
        
        }
        tam = tam.next;
    }
    if( ketqua == false){
        System.out.println("không tìm thấy kết quả !");
        }
}

// chức năng thứ 8 thống kê
// tổng số lượng hàng hóa
public int tongsoluong(){
    int sum = 0;
    node tam = head;
    if(head == null){
        System.out.println("không có sản phẩm !!!");
    }
    while( tam != null){
            sum += tam.data.soluong;
            tam = tam.next;
        }
    return sum;
    
    }
    

//
void tongsoluonghanghoa(){
    System.out.println(" tổng số lượng hàng hóa có trong kho là :" + tongsoluong() + " sản phẩm " );

}
// tổng giá trị nhập kho

public int tonggiatri(){
    int sum = 0;
    node tam = head;
    if(head == null){
        System.out.println("không có sản phẩm !!!");
    }
    while( tam != null){
        sum += tam.data.soluong*tam.data.giatien;
        tam = tam.next;

    }
    return sum ;
}
//
void tonggiatrihanghoa(){
    System.out.println(" tổng số giá trị hàng hóa có trong kho là :" + tonggiatri() + ".000 vnd" );
    }

// số lượng từng loại hàng hóa 
void soluongtungloai() {
    int thucpham = 0;
    int dienmay = 0;
    int sanhsu = 0; 
    node tam = head;
    if(head == null){
        System.out.println("không có sản phẩm !!!");
    }
        while( tam != null){
            if (("thuc pham").equals(tam.data.loai)){
                thucpham++;
            } else 
            if (("dien may").equals(tam.data.loai)){
                dienmay++;
            } else 
            if (("sanh su").equals(tam.data.loai)){
                sanhsu++;
            }
            tam = tam.next;
        }
soluongtungloaihang(thucpham , dienmay , sanhsu);
}

void soluongtungloaihang(int thucpham ,int dienmay ,int sanhsu){
    System.out.println(" số loại thực phẩm có trong kho là :" + thucpham);
    System.out.println(" số loại điện máy có trong kho là :" + dienmay);
    System.out.println(" số loại sành sứ có trong kho là :" + sanhsu);
}
}

