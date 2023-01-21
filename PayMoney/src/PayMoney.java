import java.util.Scanner;

public class PayMoney {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Transaction Array");

        int size = s.nextInt();

        int input[] = new int[size];

        System.out.println("enter the values of Array");

        for (int i = 0; i < size; i++)
            input[i] = s.nextInt();

        System.out.println("Enter the Total no of Targets that needs to be Achieved");
        int targetNo = s.nextInt();

        while (targetNo-- != 0) {

            int target;
            int flag = 0;

            System.out.println("Enter the value of target");
            target = s.nextInt();

            int sum = 0;

            for (int i = 0; i < size; i++) {
                sum += input[i];

                if (sum >= target) {
                    System.out.println("Target achieved after "+(i + 1) + " transactions ");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(" Given target is not achieved ");
            }

        }

    }
}