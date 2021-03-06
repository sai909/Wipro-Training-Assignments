import java.util.Scanner;

/**
 *  Intialize a character variable in a program and if the value is alphabet then print "Alphabet"
 *  if it’s a number then print "Digit" and for other characters print "Special Character"
 */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.nextLine().trim().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}