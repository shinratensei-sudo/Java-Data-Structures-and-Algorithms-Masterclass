import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise {
    public static int[] middle(int[] array) {
        // TODO
        if(array.length <= 2) {
            int [] newArray = {};
            return newArray;
        }else{
            int[] newArray;
            newArray = new int[array.length-2];
            for(int i=1; i <= array.length-2; i++) {
                newArray[i-1] = array[i];
            }
            return newArray;
        }
    }


    /**
     * 2D Arrays
     * Given 2D array calculate the sum of diagonal elements.
     *
     * Example
     *
     * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
     *
     * sumDiagonalElements(myArray2D) # 15
     */

    /** FIRST SOLUTION
     public static int sumDiagonalElements(int[][] array) {
        int totalSum = 0;
        for(int row = 0; row<array.length; row++) {
            for(int col = 0; col < array[0].length; col++) {
                if (row==col){
                    totalSum += array[row][col];
                }
            }
        }
        return totalSum;
    }
     */
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }

        return sum;
    }
}