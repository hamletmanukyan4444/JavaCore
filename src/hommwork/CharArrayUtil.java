package hommwork;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {'j', 'A', 'V', 'A', ' ', 'I', 'S', ' ', 'F', 'U', 'N', ' '};
        //N1
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            System.out.print(" ");
        }
        System.out.println();
        //N2
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("characters count " + count);

        if (chars.length > 0) {
            System.out.println("First character " + chars[0]);
            System.out.println("last character " + chars[5]);

        }
        //N3
        char c = 'a';
        int charCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                charCount++;
            }
        }
        System.out.println("character " + c + " count " + charCount);

        //N4
        char[] vowels = {'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'};

        int vowelscount = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelscount++;
                    break;

                }
            }
        }
        System.out.println("vowels count " + vowelscount);

        //N6
        int count2 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count2++;
            }

        }
        System.out.println("spaces count " + count2);

        //N7

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i]= temp;

        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);

//N8
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] >= 'a' && chars[i] <= 'z'){

                }


            }
        }

    }

}







