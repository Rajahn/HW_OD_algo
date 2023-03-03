import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class 找数字 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= Integer.valueOf(sc.nextLine());
        int col=Integer.valueOf(sc.nextLine());
        int[][]matrix=new int[row][col];
        Map<Integer, List<int[]>>map=new HashMap<>(); //所有值为val的元素，坐标点
        for(int i=0;i<row;i++){
            String[]strs=sc.nextLine().split(" ");
            for(int j=0;j<col;j++){
                matrix[i][j]=Integer.valueOf(strs[j]);
                int[]pos=new int[]{i,j};
                List<int[]> temp;
                if(map.containsKey(matrix[i][j])){
                    temp=map.get(matrix[i][j]);
                }else{
                    temp=new ArrayList<>();
                }
                temp.add(pos);
                map.put(matrix[i][j],temp);
            }
        }

       List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<row;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<col;j++){
               int num=matrix[i][j];
               List<int[]> pos_list=map.get(num);
               if(pos_list.size()==1){
                   temp.add(-1);
                   continue;
               }
               int min_dis=Integer.MAX_VALUE;
               for(int k=0;k<pos_list.size();k++){
                   int[]pos=pos_list.get(k);
                   int dis=Math.abs(pos[0]-i)+Math.abs(pos[1]-j);
                   if(dis==0)continue;
                   min_dis=Math.min(min_dis,dis);
               }
               temp.add(min_dis);
            }
            res.add(temp);
        }
        System.out.println(res);



    }


}
