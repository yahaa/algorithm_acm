package com.zihua.chapter_1;

/**
 * Created by zihua on 16-11-21.
 */
public class Test8 {
    public static<E extends Comparable>void qsort(E[] a,int left,int right){
        if(left>right)return;
        E temp=a[left];
        int i=left,j=right;
        while(i!=j){
            while(a[j].compareTo(temp)>=0&&i<j)j--;
            while(a[i].compareTo(temp)<=0&&i<j)i++;
            if(i<j){
                E t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[left]=a[i];
        a[i]=temp;
        qsort(a,left,i-1);
        qsort(a,i+1,right);
    }

    public static void main(String[]args){
        String []a={"jj","haha","www","jsjdf","eee","kkk","ooo"};
        qsort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
