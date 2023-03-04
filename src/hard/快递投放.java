package hard;

import java.util.*;

public class 快递投放 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int M=Integer.valueOf(s[0]);
        int N=Integer.valueOf(s[1]);
        HashMap<String, List<String>>map=new HashMap<>();
        for(int i=0;i<M;i++){
            String[]strs=sc.nextLine().split(" ");
            String pack=strs[0];
            String key=strs[1]+strs[2];
            if(map.containsKey(key)){
                map.get(key).add(pack);
            }else{
                List<String>list=new ArrayList<>();
                list.add(pack);
                map.put(key,list);
            }
        }
        List<String>res=new ArrayList<>();
        for(int i=0;i<N;i++){
            String[]strs=sc.nextLine().split(" ");
            String key=strs[0]+strs[1];
            String pack=strs[2];
            if(map.containsKey(key)){
                if(map.get(key).contains(pack)){
                    res.add(pack);
                }
            }
        }

        res.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(res);
    }
}
