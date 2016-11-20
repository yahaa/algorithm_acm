package com.zihua.chapter_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zihua on 16-11-20.
 * 自己动手实现 swap 和 permutation （递归版）
 */
public class Test2 {
    public static <E> void swap(List<E>list,int a,int b){
        E temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }

    public static <E> void permutation(List<E>list,int k,int m){
        if(k==m){
            for(int i=0;i<=m;i++){
                System.out.print(list.get(i));
            }
            System.out.println();
        }
        else {
            for(int i=k;i<=m;i++){
                swap(list,k,i);
                permutation(list,k+1,m);
                swap(list,k,i);
            }
        }
    }

    public static void main(String[]args){
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(i+1);
        }
        System.out.println(list);
        permutation(list,0,list.size()-1);
    }
}
