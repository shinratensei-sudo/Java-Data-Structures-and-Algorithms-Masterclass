public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

        int firstElement = sda.arr[0];
        System.out.println(firstElement);

        int secondElement = sda.arr[2];
        System.out.println(secondElement);


    }
}
