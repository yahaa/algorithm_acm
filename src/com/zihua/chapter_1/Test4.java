package com.zihua.chapter_1;

/**
 * Created by zihua on 16-11-20.
 */
public class Test4 {
    /**
     *
     * @param n 总共的 盘的个数
     * @param a 第一根柱子
     * @param b 第二根柱子
     * @param c 第三根柱子
     * 思路：
     *      先想办法把 第一根柱子上面的 n-1 个盘移动到第三个柱子，可以借助 第二根柱子
     *      然后把最后一块盘从 第一个柱子上面直接搬到第二个柱子上
     *      然后在想办法从第三根柱子把所有剩下的 n-1个盘移动到地二根柱子上，可以借助第一根柱子
     * 所以：函数hanoi(int n,int a,int b,int c)把n 个盘从 a柱子上移到b柱子上，可以借组 c柱子
     */
    public static void hanoi(int n,int a,int b,int c){
        if(n<=0)return;
        hanoi(n-1,a,c,b);
        System.out.println(a+" ---> "+b);
        hanoi(n-1,c,b,a);
    }
    public static void main(String[]args){
        hanoi(3,1,2,3);
    }
}
