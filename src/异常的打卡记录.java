import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
class Record{
    int num;
    int time;
    int dis;
    String device;
    String sign;
    boolean isException=false;

    public Record(int num, int time, int dis, String device, String sign) {
        this.num = num;
        this.time = time;
        this.dis = dis;
        this.device = device;
        this.sign = sign;
    }

    public boolean check(){
        if(!device.equals(sign)){
            isException=true;
        }
        if(异常的打卡记录.map.containsKey(num)){

        }
        return isException;
    }
}
public class 异常的打卡记录 {
    static HashMap<Integer,Record>map=new HashMap<>(); //工号，记录

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<Record> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[]strs=sc.nextLine().split(",");
            int num=Integer.valueOf(strs[0]);
            map.put(num,new Record(num,Integer.valueOf(strs[1]),Integer.valueOf(strs[2]), strs[3],strs[4]));
        }



    }
}
