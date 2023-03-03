import java.util.Scanner;

public class 数组的中心位置 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]strs=sc.nextLine().split(" ");
        int index=0;int[]nums=new int[strs.length];
        for(String s:strs){
            nums[index++]=Integer.valueOf(s);
        }

        int len=nums.length;
        int[]left=new int[len];
        int[]right=new int[len];
        left[0]=1;
        for(int i=1;i<len;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[len-1]=1;
        for(int i=len-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        int res=-1;
        for(int i=0;i<len;i++){
            if(left[i]==right[i]){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}
