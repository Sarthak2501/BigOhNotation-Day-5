import java.util.ArrayList;

public class Qfive1 {

    public static ArrayList<Integer>  printArray(int[][] matrix) {

        ArrayList<Integer> list=new ArrayList<>();

            int minRow = 0;
            int maxRow = matrix.length - 1;
            int minCol = 0;
            int maxCol = matrix[0].length-1;
            int totalSize = matrix.length * matrix[0].length;
            int count = 0;


            while(count < totalSize){
                for(int j = minCol ; j <= maxCol; j++){
                    list.add(matrix[minRow][j]);
                    count ++;
                }
                minRow=minRow+1;


                for(int i = minRow ; i <= maxRow ; i++){
                    list.add(matrix[i][maxCol]);
                    count++;
                }
                maxCol=maxCol-1;


                for(int j = maxCol ; j >= minCol ; j--){
                    list.add(matrix[maxRow][j]);
                    count++;
                }
                maxRow=maxRow-1;


                for(int i=maxRow;i>=minRow;i--){
                    list.add(matrix[i][minCol]);
                    count++;
                }
                minCol=minCol+1;

            }
            return list;
        }

    public static void main(String[] args) {
        int [][] arr = {{1, 2 ,3}, {4 ,5 ,6}, {7 ,8 ,9}};
        System.out.println(printArray(arr));
    }
}