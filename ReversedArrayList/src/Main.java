import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void showArray(ArrayList<Integer> array) {
        System.out.print("Your array is: [ ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.print("]\n");
    }

    public static void createReverseArray(ArrayList<Integer> array) {
        ArrayList<Integer> reversedArray = new ArrayList<>();
        for (int i = array.size() - 1; i >= 0; i--) {
            reversedArray.add(array.get(i));
        }
        System.out.print(reversedArray);
        System.out.println();
    }

    public static void showReverseArray(ArrayList<Integer> array) {
        System.out.print("Reversed array is: ");
        createReverseArray(array);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        int number;

        System.out.println("Enter the integer numbers to add the array: ");
        System.out.println("Press -1 to stop");

        number = input.nextInt();

        while (number != -1) {
            array.add(number);
            number = input.nextInt();
        }

        showArray(array);
        showReverseArray(array);

    }
}