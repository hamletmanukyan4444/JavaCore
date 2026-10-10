package lesson3;

public class Nesteloops {

    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 6; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 5; i <= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" *");
            }

            System.out.println();

        }


    }

}





