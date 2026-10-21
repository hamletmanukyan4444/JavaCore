package homeworke;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        //N1
        int n = 6;
        int Count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n)
                Count++;

        }
        System.out.println("count  " + n + " , " + Count);
        //N2
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            System.out.print(" , ");

        }
        System.out.println();

        //N3
        int[] Numbers = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatedcount = 0;
        for (int i = 0; i < Numbers.length; i++) {
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (Numbers[i] == Numbers[j]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < Numbers.length; j++) {
                if (Numbers[i] == Numbers[j]) {
                    count++;
                }
            }
            if (count > 1) {
                repeatedcount++;
            }
        }
        System.out.println("Repeated Numbers count " + repeatedcount);
        //N4
        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'n', 'o'};
        char[] chars = {'բ', 'ե', 'ր', 'և', 'ի', '2', 'խ', 'ա', 'ր', 'հ'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelsCount++;

                }
            }
        }

        System.out.println("vowels count " + vowelsCount);







    }
}





