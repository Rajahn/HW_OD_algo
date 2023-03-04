package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 基站维修 {
    static  List<String>list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        int[][]dis=new int[n][n];
        for(int i=0;i<n;i++){
            String[]strs=sc.nextLine().split(" ");
            for(int j=0;j<n;j++){
                dis[i][j]=Integer.valueOf(strs[j]);
            }
        }
        boolean[]vis=new boolean[n];
        dfs(n-1,"",vis);
        //System.out.println(list);
        int minDis=Integer.MAX_VALUE;
        for(String s:list){
            int Dis=0;
            int curPos=0;
            for(int i=1;i<s.length();i++){
                char p=s.charAt(i);
                Dis+=dis[curPos][p-'0'];
                curPos=p-'0';
            }
            minDis=Math.min(minDis,Dis);
        }

        System.out.println(minDis);


    }

    public static void dfs(int n,String s,boolean[]vis){
        if(s.length()==n){
            s="0"+s+"0";
            list.add(s);
            return;
        }
        for(int i=1;i<=n;i++){
            if(vis[i])continue;
            vis[i]=true;
            s+=i;
            dfs(n,s,vis);
            vis[i]=false;
            s=s.substring(0,s.length()-1);
        }
    }
}
