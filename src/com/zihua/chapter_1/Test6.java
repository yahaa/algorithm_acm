package com.zihua.chapter_1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by zihua on 16-11-21.
 */
public class Test6 {
    private Scanner input=new Scanner(new BufferedInputStream(System.in));
    private int [][]matrix;
    private int color=0;
    private int size;

    /**
     *
     * @param vertex_r 矩阵左上方行坐标
     * @param vertex_c 矩阵左上方列坐标
     * @param des_r    目的方块的行坐标
     * @param des_c    目的方块的列坐标
     * @param size     矩阵的规模size 必须是2^n
     **/
    public void fillBoard(int vertex_r,int vertex_c,int des_r,int des_c,int size){
        if(size==1)return;
        int s=size/2;
        int tcolor=color++;
        if(des_r<s+vertex_r&&des_c<vertex_c+s)
            fillBoard(vertex_r,vertex_c,des_r,des_c,s);
        else{
            matrix[vertex_r+s-1][vertex_c+s-1]=tcolor;
            fillBoard(vertex_r,vertex_c,vertex_r+s-1,vertex_c+s-1,s);
        }

        if(des_r<s+vertex_r&&des_c>=vertex_c+s)
            fillBoard(vertex_r,vertex_c+s,des_r,des_c,s);
        else{
            matrix[vertex_r+s-1][vertex_c+s]=tcolor;
            fillBoard(vertex_r,vertex_c+s,vertex_r+s-1,vertex_c+s,s);
        }

        if(des_r>=s+vertex_r&&des_c>=vertex_c+s)
            fillBoard(vertex_r+s,vertex_c+s,des_r,des_c,s);
        else{
            matrix[vertex_r+s][vertex_c+s]=tcolor;
            fillBoard(vertex_r+s,vertex_c+s,vertex_r+s,vertex_c+s,s);
        }

        if(des_r>=s+vertex_r&&des_c<vertex_c+s)
            fillBoard(vertex_r+s,vertex_c,des_r,des_c,s);
        else{
            matrix[vertex_r+s][vertex_c+s-1]=tcolor;
            fillBoard(vertex_r+s,vertex_c,vertex_r+s,vertex_c+s-1,s);
        }
    }

    private void show(){
        StringBuilder bu=new StringBuilder();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                bu.append(matrix[i][j]+" ");
            }
            bu.append("\n");
        }
        System.out.println(bu);
    }

    public void solve(){
        System.out.print("输入矩阵的大小： ");
        size=input.nextInt();
        matrix=new int[size][size];
        System.out.print("输入特殊方块所在的位置(row,colum)");
        int row=input.nextInt();
        int colum=input.nextInt();
        fillBoard(0,0,row,colum,size);
        show();
    }

    public static void main(String[]args){
        Test6 a=new Test6();
        a.solve();
    }
}
