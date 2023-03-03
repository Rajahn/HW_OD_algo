import java.util.Scanner;
import java.util.Stack;

public class 投篮大赛 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]ops=sc.nextLine().split(" ");
        Stack<Integer>stack=new Stack<>();
        boolean flag=false;

        for(int i=0;i<ops.length;i++){
            String op=ops[i];
            if(op.equals("+")){
                if(stack.isEmpty()){
                    flag=true;
                    break;
                }
                int pre=stack.pop();
                if(stack.isEmpty()){
                    flag=true;
                    break;
                }
                int prepre=stack.peek();
                stack.push(pre);
                stack.push(pre+prepre);

            }else if(op.equals("D")){
                if(stack.isEmpty()){
                    flag=true;
                    break;
                }
                int pre=stack.peek();
                stack.push(pre*2);

            }else if(op.equals("C")){
                if(stack.isEmpty()){
                    flag=true;
                    break;
                }
                stack.pop();
            }else {
                stack.push(Integer.valueOf(op));
            }
        }
        int res=0;
        while(!stack.isEmpty())res+=stack.pop();
        if(flag){
            System.out.println(-1);
        }else {
            System.out.println(res);
        }
    }
}
