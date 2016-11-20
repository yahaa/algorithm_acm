package com.zihua.chapter_1;

import java.util.Arrays;
import java.util.Random;
import static java.util.Arrays.*;

/**
 * Created by zihua on 16-11-20.
 */
public class Test5 {
    /**
     *
     * @param list 排序好的数组
     * @param key  要找的关键字
     * @param <E>  泛型数据类型
     * @return 返回第在数组中的下标
     */
    public static <E extends Comparable<E>> int binarySearch(E []list,E key){
        int left=0,right=list.length-1;
        while(left<=right){
            int middle=left+(right-left)/2;
            int t=key.compareTo(list[middle]);
            if(t==0)return middle;
            else if(t>0)left=middle+1;
            else right=middle-1;
        }
        return -1;
    }
    public static void main(String[]args){
        Integer []a=new Integer[100];
        Random random=new Random();
        for(int i=0;i<100;i++){
            a[i]=100;
        }
        int index=random.nextInt(99);
        a[index]=99;
        sort(a);
        System.out.println(binarySearch(a,100));


    }
}
