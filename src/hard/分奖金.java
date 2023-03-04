package hard;

import java.util.Scanner;
import java.util.Stack;

public class 分奖金 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        int[]peopel_num=new int[n];
        int[]res=new int[n];
        String[]strs=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)peopel_num[i]=Integer.valueOf(strs[i]);

        Stack<Integer> st=new Stack<>();
        int index=0;
        while (index<n){
            if(st.isEmpty()||peopel_num[st.peek()]>=peopel_num[index]){
                st.push(index);
                index++;
            }else{
                res[st.peek()]=(peopel_num[index]-peopel_num[st.peek()])*
                    (index-st.peek());
            }
        }

        while(!st.isEmpty()){
            res[st.pop()]=-1;
        }

        for(int i:res) System.out.print(i+" ");

    }
}
