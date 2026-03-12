public class Palindromeapp
{
    public static void main(String[] args) {

        String word = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Palindrome Checker - UC2");
        System.out.println("--------------------------");
        System.out.println("Checking word: " + word);

        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("--------------------------");
        System.out.println();
    }
}