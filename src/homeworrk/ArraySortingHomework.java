package homeworrk;

public class ArraySortingHomework {
    public static void main(String[] args) {

        //N1 - Descending order:
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Descending order:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

            //N2 - Ascending order:
            int[] numbers2 = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

            for (int j = 0; j < numbers2.length; j++) {

                for (int k = 0; k < numbers2.length; k++) {
                    if (numbers2[j] < numbers2[k])  {
                        int temp = numbers2[j];
                        numbers2[j] = numbers2[k];
                        numbers2[k]= temp;
                    }
                }
            }
            System.out.println("Ascending order:");

            for (int j = 0; j < numbers2.length; j++) {
                System.out.print(numbers2[j] + "  ");


            }

        }

    }

