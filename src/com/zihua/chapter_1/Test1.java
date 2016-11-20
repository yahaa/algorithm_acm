package com.zihua.chapter_1;
import java.util.*;
import static java.util.Collections.*;
import static java.util.Arrays.*;
/**
 * Created by zihua on 16-11-20.
 * 测试swap 和 泛型的用法
 *
 */
public class Test1 {
    public static int factorial(int n){
        if(n==1)return 1;
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n<=1)return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static <E> void swap(E a,E b){
        E temp=a;
        a=b;
        b=temp;
    }

    public static void swap2(TT a,TT b){
        a.a=100;
        a.b=66666;
    }

    public static void swap3(String a,String b){
        a=new String("xixix");
    }


    public static void main(String []args){
        int ans=factorial(10);
        String aa="123";
        String bb="456";
        TT a=new TT();
        TT b=new TT();
        swap2(a,b);
        String s=new String("888");
        swap3(s,bb);
        System.out.println(s);
        System.out.println(a);
        System.out.println(fibonacci(10));

    }
}

class TT{
    int a=100;
    int b=100;

    @Override
    public String toString(){
        String s=a+" "+b;
        return s;
    }
}
