import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 任务总执行时长 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]strs=sc.nextLine().split(" ");
        int taskA=Integer.valueOf(strs[0]);
        int taskB=Integer.valueOf(strs[1]);
        int num=Integer.valueOf(strs[2]);
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<=num;i++){
            set.add(taskA*i+taskB*(num-i));
        }
        System.out.println(set);
    }
}
