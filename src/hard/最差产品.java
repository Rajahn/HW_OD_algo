package hard;

import java.util.*;

public class 最差产品 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=Integer.valueOf(sc.nextLine());
        String[]strs=sc.nextLine().split(",");
        int[]nums=new int[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            nums[i]=Integer.valueOf(strs[i]);
        }
        Deque<Integer> deq=new ArrayDeque<>();//存下标 队首最小
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            while (!deq.isEmpty()&&nums[deq.peekLast()]>=nums[i]){
                deq.pollLast();
            }
            deq.addLast(i);
            //k=2  0 1 2 3
            if(i>=k-1){
                if(deq.peekFirst()==i-k)deq.pollFirst();
                list.add(nums[deq.peekFirst()]);
            }
        }
        System.out.println(list);
    }


}
