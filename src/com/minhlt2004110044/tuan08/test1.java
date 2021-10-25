package com.minhlt2004110044.tuan08;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
public class test1 {
    public static void main(String[] args) {
        Integer[] nums={3,16,22,23,27,45,99 };
       
        SortedSet<Integer> tree=new TreeSet<>(Arrays.asList(nums));
  
        printAll(tree);

  
     }
  
     public static void printAll(SortedSet<Integer> tree){
        for(int s: tree){
           System.out.println(s);
        }
        System.out.println();
     }

}
