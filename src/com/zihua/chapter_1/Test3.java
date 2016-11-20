package com.zihua.chapter_1;

/**
 * Created by zihua on 16-11-20.
 * 利用动态规划实现整数的划分 &利用递归实现整数的划分
 */
public class Test3 {
    /**
     * @param n 要划分的整数
     * @param m 最多划分为m组
     * @return 返回 n 划分为不超过 m 组的所有方案数
     *
     **/
    public static int q(int n,int m){
        if(n<1||m<1)return 0;
        if(n==1||m==1)return 1;
        if(n<m)return q(n,n);
        if(n==m)return q(n,m-1)+1;
        return q(n,m-1)+q(n-m,m);
    }

    /**
     *
     * @param n 要划分的整数
     * @param m 最多划分为 m组
     * @return 返回 n划分为 最多 m组的方案数
     * @放球模型 n个相同的球，m个相同的盒子，允许有空盒
     *
     *将整数 i 划分为最多不超过　　j 组的划分
     *分析：
	 *能划分，那么必须有每一项　ai>0,
	 *dp[i][j]为i 划分为不超过　j组的划分
     *当　i>=j ,dp[i][j]中存在ai=0,和ai>0的情况　　dp[i][j]=dp[i-j][j]+dp[i][j-1];
	 *当　i<j ,dp[i][j]=dp[i][j-1];
     **/
    public static int dp(int n,int m){
        int [][]a=new int[n+1][m+1];
        a[0][0]=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j<=i)a[i][j]=a[i-j][j]+a[i][j-1];
                else a[i][j]=a[i][j-1];
            }
        }
        return a[n][m];
    }

    public static void main(String[]agrs){
        System.out.println(q(50,3));
        System.out.println(dp(50,3));
    }
}
