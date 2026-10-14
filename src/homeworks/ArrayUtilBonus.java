package homeworks;

public class ArrayUtilBonus {
    public static void main(String[] args) {
        int[] Numbers = {25, 36, 57};
        int max = Numbers[0];
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[0] > max) ;
            max = Numbers[i];
        }
        System.out.println("max= " + max);
        for (int i = Numbers.length - 1; i >= 0; i--) {
            System.out.print(Numbers [i]);
            System.out.print(" ");

        }
    }
}
