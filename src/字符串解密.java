import java.util.*;

public class 字符串解密 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]valids=sc.nextLine().split("[0-9a-f]+");
        int count=length(sc.nextLine());
        List<String> res=new ArrayList<>();
        for(String s:valids){
            if(!s.equals("")&&length(s)<=count)res.add(s);
        }
        Collections.sort(res, (o1, o2) -> {
            int len_a=length(o1);
            int len_b=length(o2);
            if(len_a!=len_b){
                return len_b-len_a;
            }else{
                return o2.compareTo(o1);
            }
        });
        System.out.println(res.size()==0?"Not Found":res.get(0));
    }

    public static int length(String s){
        Set<Character> set =new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}
