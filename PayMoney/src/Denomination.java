import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations");
        int size = s.nextInt();

        int[] input = new int[size];
        System.out.println("enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }

        System.out.println("enter the amount you want to pay");
        int amount = s.nextInt();

        int[] noteCounter = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (amount >= input[i]) {
                noteCounter[i] = amount / input[i];
                amount = amount - noteCounter[i] * input[i];
            }
        }
        if (amount > 0) {
            System.out.println("exact amount cannot be given with the highest denomination");
        } else {
            System.out.println("Your payment approach in order to give min no of notes will be");
            for (int j = 0; j < input.length; j++) {
                if (noteCounter[j] != 0) {
                    System.out.println(input[j] + ":" + noteCounter[j]);
                }
            }
        }
    }
}
