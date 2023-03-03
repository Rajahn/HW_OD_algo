import java.util.Scanner;

public class 日志上报 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]sts=sc.nextLine().split(" ");
        int[]nums=new int[sts.length];
        int index=0;
        for(String s:sts)nums[index++]=Integer.valueOf(s);

        int[] plus_score=new int[nums.length]; //dpi 上报可获得分数
        plus_score[0]=nums[0];
        int[] minus_scors=new int[nums.length]; // i 时刻上报被减去分数
        minus_scors[0]=0;
        int[]res=new int[nums.length];
        res[0]=nums[0];

        for (int i = 1; i <nums.length ; i++) {
            plus_score[i]=Math.min(100,plus_score[i-1]+nums[i]);
            minus_scors[i]=minus_scors[i-1]+plus_score[i-1];
            res[i]=plus_score[i]-minus_scors[i];
        }

        int max_score=0;
        for(int i:res){
            max_score=Math.max(max_score,i);
        }
        System.out.println(max_score);
    }
}
