package hard;

import java.util.Scanner;

public class 机房布局{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int index=0;
        while (index<s.length()){
            char cur=s.charAt(index);
            if(cur=='M'){
                if(index+1<s.length()&&s.charAt(index+1)=='I'){
                    index+=2;
                    count++;
                }else if(index-1>=0&&s.charAt(index-1)=='I'){
                    count++;
                }else{
                    count=-1;
                    break;
                }
            }

            index++;
        }
        System.out.println(count);
    }
}
