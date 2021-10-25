package com.minhlt2004110044.kiemtragiuaki;

public class applelinkedlisttestdrive {

    public static void main(String[] args) {
        applelinkedlist applelinkedlist = new applelinkedlist();
        apple tao1 = new apple("1" , 1, "vang" );
        apple tao2 = new apple("2" , 1, "do" );
        apple tao3 = new apple("3" , 1, "tim" );

        applelinkedlist.addHead(tao1);
        applelinkedlist.addTail(tao2);

    }
}
