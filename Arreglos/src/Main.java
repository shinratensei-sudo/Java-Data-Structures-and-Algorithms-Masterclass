import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1D Array
        /*
         *
         *  SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(3, 30);
        sda.insert(12, 120);

       /*
       *int firstElement = sda.arr[0];
        System.out.println(firstElement);

        int secondElement = sda.arr[2];
        System.out.println(secondElement);

        System.out.println("Array traversal");
        sda.traverseArray();


        sda.searchInArray(10);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);
        */

        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValueInTheArray(0,0,10);
        sda.insertValueInTheArray(0,1,20);
        sda.insertValueInTheArray(1,0,30);
        sda.insertValueInTheArray(1,1,40);
        sda.accessCell(0,1);

        // System.out.println(Arrays.deepToString(sda.arr));

        sda.traverse2DArray();

        // sda.searchingValue(50);
        sda.deleteValueFromArray(0,0);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
