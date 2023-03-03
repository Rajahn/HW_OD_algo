import java.util.Scanner;

public class 自动曝光 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]sts=sc.nextLine().split(" ");
        int[]nums=new int[sts.length];
        int index=0;
        for(String s:sts){
            nums[index++]=Integer.valueOf(s);
        }
        double min_diff=256;
        Integer res=null;
        for(int k=-127;k<=128;k++){
            double sum=0;
            for(int i=0;i<nums.length;i++){
                int cur=Math.min(nums[i]+k,255); //不能超过255
                cur=Math.max(0,cur);//不能小于0
                sum+=cur;
            }
            double diff=Math.abs(sum/nums.length - 128); //添加当前k后的差值
            if(diff<min_diff){
                min_diff=diff;
                res=k;
            }else if(diff==min_diff&&res!=null){
                res=Math.min(res,k);
            }
        }
    }
}
