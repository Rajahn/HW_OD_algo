import java.util.*;

public class 通信误码 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]strs=scanner.nextLine().split(" ");
        int[]nums=new int[strs.length];
        int index=0;
        List<Integer> flist=new ArrayList<>();
        for (int i = 0; i <strs.length ; i++) {
            nums[index++]=Integer.valueOf(strs[i]);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxNum=0;
        for (int i = 0; i <nums.length ; i++) {
            flist.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            maxNum=Math.max(maxNum,map.get(nums[i]));
        }
        List<Integer>list =new ArrayList<>(); //误码频率最多的可能有多个数字，找一组相隔最小的
        for (Map.Entry<Integer,Integer>entry:map.entrySet()) {
            if(entry.getValue()==maxNum)list.add(entry.getKey());
        }
        int min=Integer.MAX_VALUE;


        for(int i=0;i<list.size();i++){
            int maxCode=list.get(i);
            int start=flist.indexOf(maxCode);
            int end=flist.lastIndexOf(maxCode);
            min=Math.min(min,end-start+1);
        }
        System.out.println(min);

    }
}
