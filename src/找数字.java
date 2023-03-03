import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class 找数字 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= Integer.valueOf(sc.nextLine());
        int col=Integer.valueOf(sc.nextLine());
        int[][]matrix=new int[row][col];
        for(int i=0;i<row;i++){
            String[]strs=sc.nextLine().split(" ");
            for(int j=0;j<col;j++){
                matrix[i][j]=Integer.valueOf(strs[j]);
            }
        }
        int[][]res=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int dis=find(matrix,i,j,)
            }
        }



    }

    public static  int find(int[][]matrix,int i,int j,int x,int y){
       if(i<0||i>matrix.length-1||j<0||j>matrix.length-1)return Integer.MAX_VALUE;
       if(matrix[i][j]!=matrix[x][y])return Integer.MAX_VALUE;
       int curDis=Math.abs(x-i)+Math.abs(y-j);
       int left=find(matrix,i-1,j,x,y);
       int right=find(matrix,i,j+1,x,y);
       int up=find(matrix,i+1,j+1,x,y);
       int down=find(matrix,i-1,j-1,x,y);
       int temp=Math.min(Math.min(left,right),Math.min(up,down));
       return Math.min(temp,curDis);
    }
}
