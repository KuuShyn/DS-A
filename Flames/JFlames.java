// King Aj Magalona BS-CS A121

/*
King Aj Magalona BS-CS A121
Discrete Structures - M2 Summative

        Mating Game in Java

        F - Friends
        L - Love
        A - Affection
        M - Marriage
        E - Enemy
        S - Sibling
*/

import java.util.Scanner;

public class JFlames {
    public static void main(String[] args) {
        System.out.println(
                "\uD83D\uDC98" + "\uD83D\uDD25" + "============\u001B[31mFLAMES\u001B[0m============" + "\uD83D\uDD25"
                        + "\uD83D\uDC98");

        Scanner input = new Scanner(System.in);

        System.out.print("\n\u001B[32mYour name\u001B[0m \t: ");
        String Your_Name = input.nextLine();
        Your_Name = Your_Name.toLowerCase().replaceAll("[^A-Za-z]", "");

        System.out.print("\u001B[32mPartner name\u001B[0m\t: ");
        String Partner_Name = input.nextLine();
        Partner_Name = Partner_Name.toLowerCase().replaceAll("[^A-Za-z]", "");

        input.close();

        String a = common(Your_Name, Partner_Name);
        String b = common(Partner_Name, Your_Name);

        int total = a.length() + b.length();

        System.out.printf("\n\u001B[32mYour name\u001B[0m\t: %1$-45s \u001B[35mCount/Remaining:\u001B[0m %2$1s",
                toArrayChar(a), a.length());
        System.out.printf("\n\u001B[32mPartner name\u001B[0m\t: %1$-45s \u001B[35mCount/Remaining:\u001B[0m %2$1s",
                toArrayChar(b), b.length());

        System.out.printf("\n\n\u001B[34mTotal Count:\u001B[0m %1$1s", total);
        printflames(total);

        System.out.println(
                "\n\uD83D\uDC98" + "\uD83D\uDD25" + "============\u001B[31mFLAMES\u001B[0m============" + "\uD83D\uDD25"
                        + "\uD83D\uDC98");
    }

    public static String toArrayChar(String str) {

        char value[] = str.toCharArray();
        String hold = "";

        for (int i = 0; i < value.length; i++) {
            hold += value[i];
            if (i != value.length - 1)
                hold += ", ";
        }

        return hold;
    }

    // King Aj Magalona BS-CS A121
    public static String common(String a, String b) {
        String commonChars = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j))
                    commonChars += a.charAt(i);

            }
        }

        for (int i = 0; i < commonChars.length(); i++)
            a = a.replace(commonChars.charAt(i) + "", "");

        return a;
    }

    public static void printflames(int n) {
        String flames = "FLAMES";

        char Result = 0;

        if (n > flames.length()) {
            n %= flames.length();
            if (n == 0) {
                n = 6;
                for (int i = 0; i < n; i++)
                    Result = flames.charAt(i);
            } else
                for (int i = 0; i < n; i++)
                    Result = flames.charAt(i);
        } else
            for (int i = 0; i < n; i++)
                Result = flames.charAt(i);

        switch (Result) {
            case 'F':
                System.out.println("\nLetter: F\n\u001B[36mYou Got Friend heh\u001B[0m");
                break;

            case 'L':
                System.out.println("\nLetter: L\n\u001B[36mYou Got Love Yiieeeee\u001B[0m");
                break;

            case 'A':
                System.out.println("\nLetter: A\n\u001B[36mYou Got Affection Yieeee\u001B[0m");
                break;

            case 'M':
                System.out.println("\nLetter: M\n\u001B[36mYou Got Marriage Sana ol\u001B[0m");
                break;

            case 'E':
                System.out.println("\nLetter: E\n\u001B[36mYou Got Enemy sad layp\u001B[0m");
                break;

            case 'S':
                System.out.println("\nLetter: S\n\u001B[36mYou Got Sibling Onii-San/Onee-Chan\u001B[0m");
                break;

            default:
                System.out.println("\nLetter: \n\u001B[36mNot Compatible mate\u001B[0m");
        }

    }

}
// King Aj Magalona BS-CS A121