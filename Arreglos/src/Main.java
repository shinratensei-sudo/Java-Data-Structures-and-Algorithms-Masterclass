public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
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
       */

        sda.searchInArray(10);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);

    }
}
