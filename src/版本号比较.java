import java.util.Scanner;

public class 版本号比较 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String[] version1=str1.split("-");
        String[] version_no=version1[0].split("\\.");
        String[] version1_info=new String[4];
        version1_info[0]=version_no[0];
        version1_info[1]=version_no[1];
        version1_info[2]=version_no[2];
        version1_info[3]=version1[1];

        String str2=sc.nextLine();
        String[] version2=str2.split("-");
        String[] version2_no=version1[0].split("\\.");
        String[] version2_info=new String[4];
        version2_info[0]=version2_no[0];
        version2_info[1]=version2_no[1];
        version2_info[2]=version2_no[2];
        version2_info[3]=version2[1];

        if(comp(version1_info,version2_info)>=0){
            System.out.println(str1);
        }else{
            System.out.println(str2);
        }
    }
    public  static int comp(String[]a,String[]b){
        if(a[0].equals(b[0])){
            if(a[1].equals(b[1])){
                if(a[2].equals(b[2])){
                    return a[3].compareTo(b[3]);
                }else {
                    return  a[2].compareTo(b[2]);
                }
            }else{
                return a[1].compareTo(b[1]);
            }
        }else{
            return a[0].compareTo(b[0]);
        }
    }
}
