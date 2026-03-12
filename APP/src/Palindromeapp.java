public class Palindromeapp
{
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Palindrome Checker - UC3");
        System.out.println("--------------------------");
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("--------------------------");
        System.out.println();
    }
}