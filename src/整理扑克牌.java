import java.util.*;

public class 整理扑克牌 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>nums=new ArrayList<>();
        for(String s:sc.nextLine().split(" ")){
            nums.add(Integer.valueOf(s));
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1); //点数为num的张数
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        //张数多的排前面，点数大的排前面
        list.sort((o1, o2) -> {
            if(o1.getValue().equals(o2.getValue())){
                return o2.getKey()-o1.getKey();
            }
            return o2.getValue()-o1.getValue();
        });
        StringBuilder sb=new StringBuilder();
        List<Integer> split_card=new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            Map.Entry<Integer,Integer> entry=list.get(i);
            int carNum=entry.getKey();
            int carCount=entry.getValue();
            if(i>0&&list.get(i-1).getValue()==3&&carCount==3){ //遇到相连三张，拆后者组合为葫芦
                split_card.add(carNum);
                carCount=2;
                entry.setValue(2);
            }else if(carCount==1&&split_card.size()!=0){ //单张时，输出牌要与被拆分的牌比较
                for (int j = 0; j <split_card.size() ; j++) {
                    if(split_card.get(j)>carNum){
                        sb.append(split_card.get(j)+" ");
                        split_card.remove(j); //不规范的list移除写法
                        j--;
                    }
                }
            }
            for (int j = 0; j <carCount ; j++) {
                sb.append(carNum+" ");
            }
        }
        if(split_card.size()!=0){
            for(int i:split_card){
                sb.append(i+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
