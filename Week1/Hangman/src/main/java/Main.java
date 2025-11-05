import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String word = "java"; // current hangman word
        String[] letters = word.split("");

        String[] dashes = new String[letters.length];
        Arrays.fill(dashes, "_");

        List<String> guessed = new ArrayList<>(); // list to print out what letters they have guessed so far, and to do input validation

        System.out.println("Welcome to Hangman, pick a letter from a-z to make a guess on the correct word.");
        int count = letters.length + 1;
        int numCorrect = 0;
        System.out.println("There are " + letters.length + " letters in the word and you have " + count + " guesses to start with.");
        System.out.println(Arrays.toString(dashes));
        System.out.println("Letters guessed so far: " + guessed);
        String nextGuess;
        boolean correctLetter = false;
        do {
            try {
                System.out.print("Please enter your guess: ");
                nextGuess = scanner.next();
                if (nextGuess.length() == 1) {
                    char ch = nextGuess.charAt(0);
                    ch = Character.toLowerCase(ch);
                    String guessStr = String.valueOf(ch);
                    if (ch >= 'a' && ch <= 'z') {
                        if (guessed.contains(guessStr)) {
                            System.out.println("You have already guessed that letter, please try again.");
                            System.out.println(Arrays.toString(dashes));
                            System.out.println("Letters guessed so far: " + guessed);
                            System.out.println("You have " + count + " guesses left.");
                            System.out.println("");
                        }
                        else {
                            guessed.add(String.valueOf(ch));
                            count -= 1;
                            for (int i = 0; i < letters.length; i++) {
                                if (letters[i].equals(guessStr)) {
                                    dashes[i] = letters[i];
                                    correctLetter = true;
                                    numCorrect += 1;
                                }
                            }
                            if (correctLetter) {
                                System.out.println("That was a correct letter!");
                                System.out.println(Arrays.toString(dashes));
                                System.out.println("Letters guessed so far: " + guessed);
                                System.out.println("You have " + count + " guesses left.");
                                correctLetter = false;
                                if (!Arrays.asList(dashes).contains("_")) {
                                    System.out.println("");
                                    System.out.println("You win! The word was " + Arrays.toString(letters));
                                    break;
                                }
                                if (letters.length - numCorrect <= 4) {
                                    System.out.println("Do you want to make a guess on what the word is? Enter \"yes\" or \"no\"");
                                    String input = scanner.next();
                                    if (input.equals("yes")) {
                                        System.out.println("");
                                        System.out.print("Please enter what you think the word is: ");
                                        input = scanner.next();
                                        input = input.toLowerCase();
                                        if (input.equals(word)) {
                                            System.out.println("You Win! The word was " + Arrays.toString(letters));
                                            break;
                                        }
                                        System.out.println("That guess was incorrect!");
                                        System.out.println("");
                                    }
                                    else {
                                        System.out.println("");
                                    }
                                }
                            }
                            else {
                                System.out.println("That was not a correct letter!");
                                System.out.println(Arrays.toString(dashes));
                                System.out.println("Letters guessed so far: " + guessed);
                                System.out.println("You have " + count + " guesses left.");
                                System.out.println("");
                            }
                        }
                    }
                    else {
                        System.out.println("Please enter a value from [a-z]");
                        System.out.println("");
                    }
                }
                else {
                    System.out.println("Please enter a value from [a-z]");
                    System.out.println("");
                }

            } catch (Exception e) {
                System.out.println("Sorry that guess was invalid, please try again...");
                System.out.println("");
            }
        } while (count > 0);
        if (count == 0) {
            System.out.println("You can make one last guess... ");
            System.out.print("Please enter a guess on what you think the word is: ");
            nextGuess = scanner.next();
            if (nextGuess.equals(word)) {
                System.out.println("You Win!");
            }
            else {
                System.out.println("You Lose!");
            }
        }
    }
}
