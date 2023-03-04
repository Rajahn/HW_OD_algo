package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 差异数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<Integer>list=new ArrayList<>();
        for(String s:sc.nextLine().split(" ")){
            list.add(Integer.valueOf(s));
        }
        //差异 异或  相似 与 差异大于相似，两数最高位的1不同
        //会造成差异数的开头为1，相似数的最高位0 只要比较有多少二进制位数不同的数，就能找到有多少种搭配
        int[]bit_info=new int[100]; //100位2进制表示所有数
        for(int num:list){
            String num_binary=Integer.toBinaryString(num);
            //System.out.println(num_binary);
            if("0".equals(num_binary)){ //如果输入是0，无法用length处理 特殊处理一下
                bit_info[0]++;
            }else {
                bit_info[num_binary.length()]++;
            }
        }

        int res=0;
        for(int i=0;i<bit_info.length;i++){
            for(int j=i+1;j<bit_info.length;j++){
                res+=bit_info[i]*bit_info[j];
            }
        }
        System.out.println(res);
    }
}
