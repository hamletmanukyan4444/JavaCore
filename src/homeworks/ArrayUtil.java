package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            //N1
            System.out.print(numbers[i]);
            System.out.print(" ");

        }
        System.out.println();
        //N2
        System.out.println(numbers[0]);
        //N3
        System.out.println(numbers[numbers.length - 1]);
        //N4
        System.out.println(numbers.length);
        //N5
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min= " + min);
        //N6
        System.out.println(numbers[numbers.length / 2]);

//N7
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("even numbers count " + count);

        //N8
        int oddcount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println("odd numbers count " + oddcount);

        //N9
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum = " + sum);

    }
}













