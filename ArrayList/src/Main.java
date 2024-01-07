import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        /*   ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30,10,20)); // Arrays as List
         *   System.out.println(numbers);

         */

        // -------------- Accessing elements Array List ------------------
        /* ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add(2,"C");
        System.out.println(stringList);
        System.out.println(stringList.get(2));
        System.out.println(stringList.get(0));
         */

        // ------------- Traversing Array List ------------------------
        /* ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");

        // first way
        for(int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Second way: for each Java
        for(String letter: stringList) {
            System.out.println(letter);
        }

        // Third way: Iterator interface
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()) {
            String letter = iterator.next();
            System.out.println(letter);
        }
        */

        //---------------- Searching Array List ---------------------------

        /*
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        for(String letter: stringList) {
            if(letter.equals("F")){
                System.out.println("The element is found");
                break;
            }
        }

        // indexOf
        int index = stringList.indexOf("A");
        System.out.println("The element is found at index "  + index);

         */

        // ------------ DELETE ELEMENT FROM ARRAY LIST -----------------
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        stringList.remove(2);
        stringList.remove("D");
        System.out.println(stringList);
    }
}

