package hard;

import java.util.HashMap;
import java.util.Scanner;

public class 优雅数组 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int k=sc.nextInt();
        int[]nums=new int[A];
        for (int i = 0; i < A; i++) {
            nums[i]=sc.nextInt();
        }
        int left=0;
        int right=0;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(left<A&&right<A){
            int c=nums[right];
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>=k){
                res+=A-right;//从现在到结尾所有子数组满足条件
                map.put(nums[left],map.get(nums[left])-1);
                left++;
                map.put(c,map.get(c)-1);
                right--;
            }
            right++;
        }
        System.out.println(res);
    }


}
