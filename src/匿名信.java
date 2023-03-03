import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 匿名信 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] news=sc.nextLine().split(" ");
        String[] anony=sc.nextLine().split(" ");
        boolean flag=true;
        for(String anonys:anony){
            for(int i=0;i<news.length;i++){
                String newspaper=news[i];

                if(newspaper.length()==anonys.length()&&hundle(newspaper,anonys)){
                    news[i]="";
                    break;
                }
                if(i==news.length-1){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

    public static boolean hundle(String news,String annoy){
        char[]chars1=news.toCharArray();
        char[]chars2=annoy.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i <chars1.length ; i++) {
            if(chars1[i]!=chars2[i])return false;
        }
        return true;
    }


}
