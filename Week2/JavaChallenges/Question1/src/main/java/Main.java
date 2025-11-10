/*

Question 1:
Write a function to help Ava count the number of words that start with a vowel in the given sentence.

Function Description:
The function Main should take a string sentence as input and return an integer representing the
count of words that begin with a vowel.

Constraints:
(1 <= len(sentence <= 10^5)
The sentence contains only alphabetic characters and spaces.

Input Format:
    The input consists of a single line:
        A string sentence representing the sentence to analyze.

Output Format:
    Print a single integer:
        the number of words in the sentence that start with a vowel.

Sample Input:
    An umbrella is outside on the avenue

Sample Output:
    6
 */

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String sentence = scanner.nextLine();
//        String[] words = sentence.split(" ");

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelCount = 0;
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            if (vowels.contains(word.charAt(0))) {
                vowelCount++;
            }
        }
        scanner.close();
        System.out.println(vowelCount);
    }
}
