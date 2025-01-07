
import java.util.Scanner;

public class Scan2 {

    public static void main(String[] args) {
            int num;

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter num:");
            num = scan.nextInt();

            int count, i;
            // count holds the factors count.
            count = 0;

            // for each number from 1 to n.
            i = 1;
            while (i <= num) {

                // if i is a factor of n i.e. reminder 0.
                if (num % i == 0) {
                    // factor count incremented.
                    count++;
                }
                // increment i, to take the next number.
                i++;
            }
        }
    // If only two factors found, it is prime else not.
}
