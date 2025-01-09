public class Pattern_11 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // space print

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            // star print

            for (int k = 1; k <= i; k++) {

                System.out.print(i + " ");
            }

            System.out.println();

        }
    }

}