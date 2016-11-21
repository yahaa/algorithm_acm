package com.zihua.chapter_1;

import java.util.Comparator;

/**
 * Created by zihua on 16-11-21.
 */
public class Test7 {

    public static<E extends Comparable> void mergeSort(E []a){
        dosort(a,0,a.length);
    }

    private static <T extends Comparable> void dosort(T[] a, int first, int last){
        if(first<last){
            int midlle=(last+first)/2;
            dosort(a,first,midlle);
            dosort(a,midlle+1,last);
            merges(a,first,midlle,last);
        }

    }

    private static <T extends Comparable> void merges(T[]a,int first,int middle,int last){
        T []b=(T[])new Object[last-first+1];
        int i=first,j=middle+1,k=0;
        while(i<=middle&&j<=last){
            int t=a[i].compareTo(a[j]);
            if(t<=0)b[k++]=a[i];
            else b[k++]=a[j];
        }
        while(i<=middle)b[k++]=a[i++];
        while(j<=last)b[k++]=a[j++];
        for(i=0;i<k;i++)
            a[first+i]=b[i];

    }

    public static void main(String[]args){
        Integer []a={3,5,6,9,8,4,5,3};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }


}
