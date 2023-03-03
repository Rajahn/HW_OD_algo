public class 消消乐 {
    public static void main(String[] args) {

        int count=0;
        int m=0;
        int n=0;
        int[][]matrix=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]!=0){
                    dfs(matrix,i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int[][] matrix, int i, int j){
        if(i<0||i>=matrix.length||j<0||j>=matrix[0].length){
            return;
        }else if(matrix[i][j]==0){
            return;
        }else {
            matrix[i][j]=0;
        }
        dfs(matrix,i-1,j);
        dfs(matrix,i-1,j-1);
        dfs(matrix,i-1,j+1);
        dfs(matrix,i,j-1);
        dfs(matrix,i,j+1);
        dfs(matrix,i+1,j);
        dfs(matrix,i+1,j-1);
        dfs(matrix,i+1,j+1);
    }
}
