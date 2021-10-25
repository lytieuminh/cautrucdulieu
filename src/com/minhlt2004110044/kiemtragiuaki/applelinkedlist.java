package com.minhlt2004110044.kiemtragiuaki;

public class applelinkedlist {
    node head = null;
    node tail = null;

    public applelinkedlist(){
    }

    //thêm vào cuối danh sách
    void addTail(apple data) {
        // bước 1: tạo node mới 
        node newNode = new node(data);
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

    //thêm vào đầu danh sách
    void addHead(apple data){
        node newNode = new node(data);
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

    //in danh sách
    void print(){
        node tam = head;

        if(head == null){
            System.out.println("Danh sách rỗng !!!");
            return;
        }
        System.out.println("========Các nút trong danh sách=========");


        while(tam != null){
            System.out.println("===========================");
            System.out.println("ID táo : " + tam.data.id);
            System.out.println("Màu sắc : " + tam.data.mausac);
            System.out.println("Khối Lượng : " + tam.data.khoiluong);
            tam = tam.next;
        }
    }

    //thêm vào vị trí trước số cần tìm
    void addAfter(apple taoCanTim,apple taoCanThem){
        int dem = 0;
        node tam = head;
        node truocTam = head;
        while(tam != null){
            if(tam.data.id.equals(taoCanTim.id))
                break;
            tam = tam.next;
            dem++;
            if(dem>1)
                truocTam = truocTam.next;
            
        }
        node them = new node();
        them.data = taoCanThem;
        
        if(dem == 0){
            addHead(taoCanThem);
        } else {
            them.next = tam;
            truocTam.next = them;
        }
    }

    void deleteTail(){
        node tam = head;
        while(tam != null){
            if(tam.next == tail){
                tam.next = null;
                tail = tam;
                break;
            }
            tam = tam.next;
        }
    }





}
