import java.util.HashMap;
import java.util.Scanner;

public class 箱子之字形摆放 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]strs=sc.nextLine().split(" ");
        int len=strs[0].length();
        int n=Integer.valueOf(strs[1]);

        HashMap<Integer,String>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,"");
        }
        int index=0;
        int down=1;
        for(int i=0;i<len;i++){
           String level= map.get(index);
           map.put(index,level+strs[0].charAt(i));
            index+=down;
            if(index==n){
                down=-down;
                index+=down;
            }
            if(index==-1){
                down=-down;
                index+=down;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(map.get(i));
        }
    }
}
