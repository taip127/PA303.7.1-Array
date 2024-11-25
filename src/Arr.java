import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Arr {

    /*●	Task 1: Write a program that creates an array of integers with a length of 3
    . Assign the values 1, 2, and 3 to the indexes
    . Print out each array element.
    */
    public static void arrayTask1() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void arrayTask2() {
        int[] array = {13, 5, 7, 68, 2};
        System.out.println(array[array.length / 2]);
    }

    public static void arrayTask3() {
        String[] array = {"red", "green", "blue", "yellow"};
        System.out.println(array.length);
        String[] copied = array.clone();
        System.out.println(Arrays.toString(copied));
    }

    public static void arrayTask4() {
        int[] array = {13, 5, 7, 68, 2};
        System.out.println("first index value: " + array[0]);
        System.out.println("last index value: " + array[array.length - 1]);
        System.out.println(" index value at array.length: " + array[array.length]);
    }

    public static void arrayTask5() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void arrayTask6() {
        int[] array = {13, 5, 7, 68, 2};
        for(int element : array) {
            element *=2;
            System.out.println(element);
        }
    }

    public static void arrayTask7() {
        int[] array = {13, 5, 7, 68, 2};
        for (int i = 0; i < array.length; i++) {
            if (i != array.length / 2) {
                System.out.println(array[i]);
                }
        }
    }

    public static void arrayTask8() {
        String[] array = {"red", "green", "blue", "yellow","black"};
        String str = array[array.length / 2];
        array[array.length/2] = array[0];
        array[0] = str;
        System.out.println(Arrays.toString(array));
    }

    public static void arrayTask9() {
        int[] array = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.println("Array in ascending order: " + Arrays.toString(array));
        System.out.println("The smallest number is: " + array[0]);
        System.out.println("The largest number is: " + array[array.length - 1]);
    }

    public static void arrayTask10() {
       Object[] array = {1,2,3,"a","b","c",3.14,19.99};
       System.out.println(Arrays.toString(array));
    }

    public static void arrayTask11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many favorite things: ");
        int n = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter your favorite thing: ");
            String thing = scanner.next();
            array[i] = thing;
        }
        System.out.println(Arrays.toString(array));

    }
}
