package hard;

import java.util.Scanner;

public class 芯片资源占用 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=Integer.valueOf(sc.nextLine());
        int N=Integer.valueOf(sc.nextLine());
        String ops=sc.nextLine();
        double[]used=new double[N]; //n块芯片，记录每块芯片的剩余空间
        for (int i = 0; i < N; i++) {
            used[i]=M*1.25;
        }
        for(int i=0;i<ops.length();i++){
            double capacity=0;
            if(ops.charAt(i)=='A'){
                capacity=1.25;
            }else if(ops.charAt(i)=='B'){
                capacity=2.5;
            }else {
                capacity=10;
            }
            //尝试从第一块芯片开始分配空间
            for(int j=0;j<N;j++){
                if(used[j]>=capacity){
                    used[j]-=capacity;
                    break;
                }
            }
        }
        //输出每块芯片的占用情况
        for (int j = 0; j <N ; j++) {
            String out="";
            //used[j]为j号芯片剩余可用空间，除1.25得到占用多少单位
            for (int k=0;k<M-used[j]/1.25;k++){
                out+='1';
            }
            for (int i = 0; i <used[j]/1.25 ; i++) {
                out+='0';
            }
            System.out.println(out);
        }

    }
}
