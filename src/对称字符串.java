import java.util.Scanner;

public class 对称字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n= sc.nextInt();
            long k=sc.nextLong();

            String str = search(n,k,false);

            if(str.equals("R")){
                System.out.println("red");
            }else {
                System.out.println("blue");
            }
        }
    }
    public static String search(int n ,long k,boolean flag){ //flag为真代表反转
        if(n == 1){
            return flag ? "B" : "R";
        }
        int len = (int) Math.pow(2,n - 1); //判断当前字符串有多长
        if(k < len/2){ //说明在反转的前半段里找，仍然找第k位即可
            return search(n - 1,k,!flag);
        }else { //在没有反转的后半段里找，k-len/2
            return search(n - 1,k - len/2,flag);
        }
    }
}
