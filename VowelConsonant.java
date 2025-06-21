import java.util.Scanner;
class VowelConsonant {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter any character: ");
        
        char ch = Sc.next().toLowerCase().charAt(0);
       
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println("Not a valid alphabet.");
        }
        }
    }

// Enter any character: e
// e is a Vowel.

// Enter any character: z
// z is a Consonant.

