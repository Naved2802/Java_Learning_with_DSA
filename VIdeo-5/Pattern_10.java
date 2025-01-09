public class Pattern_10 {

    public static void main(String[] args) {

        // Solid Rhombus

        int n = 5;

        int m = 5;

        for (int i = 1; i <= n; i++) {

            // space print

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= m; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }

}
