package hard;

import java.util.Scanner;

public class 数字加减游戏 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        //+a -a 只有一种存在
        //t-(s-ai)=bj -> (t-(s-ai))%b=0
        //(t-(s+ai))%b=0;
        int i=0;
        int j=0;
        int res=0;
        while(true){
            if((t-(s-a*i))%b==0){
                res=i;
                break;
            }else {
                i++;
            }
            if((t-(s+a*j))%b==0){
                res=j;
                break;
            }else {
                j++;
            }

        }
        System.out.println(res);
    }
}
