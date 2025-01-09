public class Pattern_7 {

    public static void main(String[] args) {

        // Inverted Half Pyramid with Numbers

        int n = 5;

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}
