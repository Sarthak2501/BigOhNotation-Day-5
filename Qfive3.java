import javax.swing.plaf.IconUIResource;

public class Qfive3 {
    public static void main(String[] args) {
        String [][] grid = {
                {"1","1","1","1","0"},
                {"1","1","0","1","0"},
                {"1","1","0","0","0"},
                {"0","0","0","0","0"}};
        String [][] grid2 = {
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}};
        int count = 0 ;

        for (int i = 0 ; i < grid2.length ; i++){
            for (int j  = 0 ; j < grid2[0].length ; j++){
                if (grid2[i][j] == "1"){
                    dfs(grid2,i,j);
                    count++;
                }
            }
        }
        System.out.println("The number of Island : " + count);
    }

    public static void dfs(String [][] grid , int row, int col){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return;
        }
        if(grid[row][col] == "0" ){
            return;
        }

        grid[row][col] = "0";

        dfs(grid , row , col - 1);
        dfs(grid , row , col + 1);
        dfs(grid, row - 1 , col);
        dfs(grid, row + 1 , col);
    }
}
