import java.lang.reflect.Array;
import java.util.Arrays;

public class Qfive2 {

        public static int[] findAns(int[][] arr, int target)
        {
            int row = arr.length;                  // row = 3
            int col = arr[0].length;               // col = 4
            int l = 0, h = row * col - 1;          // 12 - 1 = 11

            while (l <= h) {                      // iter 1 = 0 <= 11 = True     iter 2 = 0 <= 4           iter 3 = 0 <= 1          iter 4 1 <= 1
                int mid = l + (h - l) / 2;        // 0 + (11 - 0)  / 2 = 5       0 + (4 - 0) / 2 = 2       0 + (1 - 0) / 2 = 0      1

                int tC = mid % col;               // tc = 5 % 4 = 1              tc = 2 % 4 = 2             tc = 0 % 4 = 0           tc = 1 % 4 = 1
                int tR = mid / col;               // tr = 5 / 4 = 1              tr = 2 / 4 = 0             tr = 0 / 2 = 0           tr = 1 / 4 = 0
                int val = arr[tR][tC];            // val = arr[1][1] = 10        arr[0][2] = 5               arr[0][0] = 1           arr[0][1] = 3
                if (val == target)                // 10 == 3 = False             5 == 3 = False             1 == 3 == False          3 == 3 == true
                    return new int[] { tR, tC };  //                                                                                  {0 , 1}

                if (val < target)                // 10 < 3 = False               5 < 3 = false               1 < 3 = True
                    l = mid + 1;                 //                                                          l = 0 + 1
                else                             // 10 > 3 == True               5 > 3 = True
                    h = mid - 1;                 // h = 5 - 1 = 4                h = 2 - 1 = 1
            }

            return new int[] { -1, -1 };
        }

        // Driver Code
        public static void main(String[] args)
        {

            // Binary search in sorted matrix
            int arr[][] = { { 1, 3, 5, 7 },
                    { 10, 11, 16, 20 },
                    { 23, 30, 34, 60 } };
            int[] ans = findAns(arr, 3);
            System.out.println("Element found at index: "
                    + Arrays.toString(ans));
        }

        // time complexity : O(M + N)
}

