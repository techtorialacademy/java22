package ForLoop;

public class ForLoop3_Practice {
    public static void main(String[] args) {
        String str = "Java is getting very easy to work with!";
        // Print the count of letter `t` from the string above.

        // 1. I would check each letter in a string
        // 2. Everytime I encounter letter `t`, I would increase the count of letter t.
        // 3. To store the count of letter I would create a variable.
        // 4. To check each letter in a string I would use loop.
        int countOfLetterT = 0;
        // The range of values that I need to look starts from 0 and goes up to length of string.
        // as an index length of string is not included.
        for( int i = 0 ; i < str.length() ; i++ ){
                // How could I check the letter at index number i?
            char currentCharacter = str.charAt(i);
            // If the current character is `t`, then I would increase the count of letter t.
            if(currentCharacter == 't'){
                countOfLetterT++;
            }
        }

        System.out.println("Count of letter t in the string is "+countOfLetterT + ".");








    }
}
