package hommwork;

public class CharArrayUtil {
    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        // N1 - Տպել բոլոր սիմվոլները
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();


        // N2 - Հաշվել սիմվոլների քանակը
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            count++;
        }

        System.out.println("Characters count: " + count);

        if (chars.length > 0) {
            System.out.println("First character: " + chars[0]);
            System.out.println("Last character: " + chars[chars.length - 1]);
        }


        // N3 - Հաշվել տրված սիմվոլի քանակը
        char c = 'a';
        int charCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                charCount++;
            }
        }

        System.out.println("Character " + c + " count: " + charCount);


        // N4 - Հաշվել ձայնավորների քանակը
        int vowelsCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' ||
                    chars[i] == 'i' || chars[i] == 'o' ||
                    chars[i] == 'u' || chars[i] == 'A' ||
                    chars[i] == 'E' || chars[i] == 'I' ||
                    chars[i] == 'O' || chars[i] == 'U') {

                vowelsCount++;
            }
        }

        System.out.println("Vowels count: " + vowelsCount);


        // N5 - Հաշվել բաղաձայնների քանակը
        int consonantsCount = 0;

        for (int i = 0; i < chars.length; i++) {

            if ((chars[i] >= 'a' && chars[i] <= 'z') ||
                    (chars[i] >= 'A' && chars[i] <= 'Z')) {

                if (chars[i] != 'a' && chars[i] != 'e' &&
                        chars[i] != 'i' && chars[i] != 'o' &&
                        chars[i] != 'u' && chars[i] != 'A' &&
                        chars[i] != 'E' && chars[i] != 'I' &&
                        chars[i] != 'O' && chars[i] != 'U') {

                    consonantsCount++;
                }
            }
        }

        System.out.println("Consonants count: " + consonantsCount);


        // N6 - Հաշվել բացատների քանակը
        int spacesCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spacesCount++;
            }
        }

        System.out.println("Spaces count: " + spacesCount);


        // N7 - Շրջել սիմվոլների հերթականությունը
        char[] reversed = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[i];
        }

        for (int i = 0; i < reversed.length / 2; i++) {
            char temp = reversed[i];

            reversed[i] = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = temp;
        }

        System.out.print("Reversed: ");

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }

        System.out.println();


        // N8 - Uppercase
        char[] upper = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            upper[i] = chars[i];

            if (upper[i] >= 'a' && upper[i] <= 'z') {
                upper[i] = (char) (upper[i] - 32);
            }
        }

        System.out.print("Uppercase: ");

        for (int i = 0; i < upper.length; i++) {
            System.out.print(upper[i]);
        }

        System.out.println();


        // N8 - Lowercase
        char[] lower = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            lower[i] = chars[i];

            if (lower[i] >= 'A' && lower[i] <= 'Z') {
                lower[i] = (char) (lower[i] + 32);
            }
        }

        System.out.print("Lowercase: ");

        for (int i = 0; i < lower.length; i++) {
            System.out.print(lower[i]);
        }

        System.out.println();


        // N9 - Փոխարինել տրված սիմվոլը
        char[] replaced = new char[chars.length];

        char oldChar = 'a';
        char newChar = '*';

        for (int i = 0; i < chars.length; i++) {
            replaced[i] = chars[i];

            if (replaced[i] == oldChar) {
                replaced[i] = newChar;
            }
        }

        System.out.print("Replaced: ");

        for (int i = 0; i < replaced.length; i++) {
            System.out.print(replaced[i]);
        }

        System.out.println();


        // N10 - Ստուգել Palindrome-ը
        char[] palindrome = {'l', 'e', 'v', 'e', 'l'};

        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length / 2; i++) {

            if (palindrome[i] != palindrome[palindrome.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is palindrome: " + isPalindrome);


        // Bonus 1 - Գտնել առաջին հանդիպման ինդեքսը
        char[] bonusChars = {'a', 'b', 'c', 'a', 'd'};

        char target = 'a';
        int firstIndex = -1;

        for (int i = 0; i < bonusChars.length; i++) {
            if (bonusChars[i] == target) {
                firstIndex = i;
                break;
            }
        }

        System.out.println("First index: " + firstIndex);


        // Bonus 2 - Համեմատել երկու զանգված
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean areEqual = true;

        if (first.length != second.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Arrays are equal: " + areEqual);


        // Bonus 3 - Հեռացնել կրկնվող սիմվոլները
        char[] duplicateChars = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < duplicateChars.length; i++) {

            boolean alreadyExists = false;

            for (int j = 0; j < i; j++) {
                if (duplicateChars[i] == duplicateChars[j]) {
                    alreadyExists = true;
                    break;
                }
            }

            if (alreadyExists == false) {
                System.out.print(duplicateChars[i] + " ");
            }
        }

        System.out.println();
    }
}














