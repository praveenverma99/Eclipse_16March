package Daily_Practice;

public class ForwardSlash_BackwardSlash {

    public static void main(String[] args) {
        // Printing forward slashes
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        // Printing backward slashes
        for (int k = 1; k <= 5; k++) {
            for (int l = 5; l > k; l--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= k; m++) { // Fixed the increment part from k to m
                if (k >= 2 && m > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
