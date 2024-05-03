public class Ulam {
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            if (!terminatesUlamSequence(i)) {
                System.out.println("Error: The Ulam sequence does not terminate for n = " + i);
                return;
            }
        }
        System.out.println("The Ulam sequence terminates for all positive integers less than 1 million.");
    }

    public static boolean terminatesUlamSequence(int n) {
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        }
        return true;
    }
}
