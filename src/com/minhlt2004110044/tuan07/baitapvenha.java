package com.minhlt2004110044.tuan07;

public class baitapvenha {
    
    Node head = null;
    Node tail = null;

//thêm vào cuối danh sách
void add(int data) {
    // bước 1: tạo node mới 
    Node newNode = new Node(data);
    // bươc 2: kiểm tra và thêm một nút vao danh sách rỗng
    if (head == null){
        head = newNode;
        tail = newNode;
    }else{
        //nếu danh sách không rỗng //thêm vao duôi danh sách
        tail.next =newNode;
        tail = newNode;// di chuyển theo ra cuối
    }
}
//in danh sách
void print(){
    Node tam = head;

    if(head == null){
        System.out.println("Danh sách rỗng !!!");
        return;
    }
    System.out.println("========Các nút trong danh sách=========");
    while(tam != null){
        System.out.println(tam.data);
        tam = tam.next;
    }
}
//thêm vào đầu danh sách
void addHead(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        tail = newNode;
        tail.next = head;
    }else{
        newNode.next = head;
        tail = newNode;
        head = newNode;
    }
}
//thêm vào vị trí trước số cần tìm
void addAfter(int soCanTim,int soCanThem){
    int dem = 0;
    Node tam = head;
    Node truocTam = head;
    while(tam != null){
        if(tam.data == soCanTim)
            break;
        tam = tam.next;
        dem++;
        if(dem>1)
            truocTam = truocTam.next;
        
    }
    Node them = new Node();
    them.data = soCanThem;
    
            if(dem == 0){
                addHead(soCanThem);
            }else{
                 them.next = tam;
                 truocTam.next = them;
                 }
    
    
    }
    //xoá đầu danh sách
    void deleteHead(){
        head = head.next;
    }
    //xóa cuối danh sách
    void deleteTail(){
        Node tam = head;
        while(tam != null){
            if(tam.next == tail){
                tam.next = null;
                tail = tam;
                break;
            }
            tam = tam.next;
        }
    }
    //xóa số bất kỳ trong danh sách
    void delete(int soCanXoa){
        Node tam = head;
        
        
        while(tam != null){
            if(tam.next.data == soCanXoa)
                break;
            tam = tam.next;
        }
        tam.next = tam.next.next;
    }
    //sửa thông tin của 1 phần tử
    void fix(int soCanSua,int soDaSua){
        Node tam = head;
        while(tam != null){
            if(tam.data == soCanSua)
                break;
            tam = tam.next;
        }
        tam.data = soDaSua;
    }
}