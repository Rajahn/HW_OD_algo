package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
前往后遍历，如果数字数量达到3，则看前面两个数字，先看第一个，
如果这个数字后面的数字比他大，就删这个，否则看第二个，
如果第二个后面的数字比他大，就删第二个，否则删刚遇到的这个
 */
public class 最大数字 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<Integer>list=new ArrayList<>();
        int[]record=new int[10];
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            if(record[num]<2){
                list.add(num);
                record[num]++;
            }else{
                int index1=list.indexOf(num);
                int index2=list.lastIndexOf(num);
                if(list.get(index1+1)>list.get(index1)){
                    list.remove(index1);
                    list.add(num);
                    continue;
                }

                if(index2<list.size()-1&&list.get(index2+1)>list.get(index2)){
                    list.remove(index2);
                    list.add(num);
                    continue;
                }
            }
        }
        System.out.println(list);


    }
}
