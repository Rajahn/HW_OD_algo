import java.util.*;

public class 关联端口组合并 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        String[] strs=sc.nextLine().split(" ");
        List<Set>list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            Set<Integer>set=new TreeSet<>();
            for(char c:strs[i].toCharArray()){
                set.add(c-'0');
            }
        }



    }
}
