public class Pattern_12 {

    public static void main(String[] args) {

        // Palindromic number pyramid

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int l = n - 1; l >= i ; l--) {

                System.out.print("  ");
            }

            for (int j = i; j >= 2; j--) {

                System.out.print(j + " ");
            }

            for (int k = 1; k <= i; k++) {

                System.out.print(k + " ");

            }

            System.out.println();
        }

    }

}
