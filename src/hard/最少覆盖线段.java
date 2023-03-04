package hard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 最少覆盖线段 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<int[]>list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String strs[]=sc.nextLine().split(",");
            list.add(new int[]{Integer.valueOf(strs[0]),
                Integer.valueOf(strs[1])});
        }
        list.sort((o1, o2) -> {
            if(o1[0]!=o2[0])return o1[0]-o2[0];
            return o1[1]-o2[1];
        });
        List<int[]>res=new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            int[]left=list.get(i-1);
            int[]right=list.get(i+1);
            if(left[1]>=right[0]){
                if(!res.contains(left))res.add(left);
                if(!res.contains(right))res.add(right);
            }
        }
        for(int[]a:res)System.out.println(a[0]+","+a[1]);

    }
}
