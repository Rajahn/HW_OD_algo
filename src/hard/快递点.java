package hard;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 快递点 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        int[][]matrix=new int[n][n];
        for(int i=0;i<n;i++){
            String[]strs=sc.nextLine().split(" ");
            for(int j=0;j<n;j++){
                matrix[i][j]=Integer.valueOf(strs[j]);
            }
        }
        Set<Integer> set=new HashSet<>();
        int res=0;
        for(int i=0;i<n;i++){
            if(set.contains(i))continue;
            Set<Integer>temp=new HashSet<>();
            temp.add(i);
            check(temp,i,matrix);
            set.addAll(temp);
            res++;
        }
        System.out.println(res);

    }

    public static  void check(Set<Integer> set,int n,int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            if(set.contains(i))continue;
            if(i!=n&&matrix[n][i]==1){
                set.add(i);
                check(set,i,matrix);
            }
        }
    }
}
