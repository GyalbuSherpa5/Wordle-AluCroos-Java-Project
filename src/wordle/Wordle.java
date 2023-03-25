package wordle;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Wordle {
    public String words() {
        String[] word = {"ABOVE", "ADMIT", "ADOPT", "ADORE",
                "BIRTH", "BENCH", "CHOKE", "CHORD", "CHUNK", "DRIVE", "DUTCH", "DRAIN", "ENJOY", "EPOCH", "FAULT",
                "FAVOR", "FEAST", "GAMER", "GREAT", "HUMAN", "HUMOR", "HORSE", "JUDGE", "JOKER", "IRONY", "ITCHY",
                "LOFTY", "LOSER", "MONTH", "MODEL", "OPERA", "PAUSE", "PURGE", "ROBIN", "ROUND",
                "ROYAL", "SCOLD", "SHAKE", "SHAME", "SKIRT", "SMITE", "SNEAK", "SOLAR", "SOUND", "STORY",
                "TOUGH", "TWICE", "UNIFY", "VIRAL", "VITAL", "WACKY", "WASTE", "WORSE", "YIELD", "YOUTH"};
        int index = ThreadLocalRandom.current().nextInt(word.length);
        return word[index];
    }

    public int play(char[] character, String solution) {

        char[] answer = new char[5];
        for (int i = 0; i < solution.length(); i++) {
            answer[i] = solution.charAt(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("+---+ ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            boolean flag = true;
            for (int j = 0; j < 5; j++) {
                if (character[i] == answer[j]) {
                    if (i == j) {
                        System.out.print(Color.GREEN_BOLD_BRIGHT + "| " + character[i] + " | " + Color.RESET);
                        flag = false;
                        count++;
                        break;
                    }
                    System.out.print(Color.YELLOW_BOLD_BRIGHT + "| " + character[i] + " | " + Color.RESET);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(Color.RED_BOLD_BRIGHT + "| " + character[i] + " | " + Color.RESET);
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("+---+ ");
        }
        System.out.println();
        return count;
    }

    public boolean playAgain(Scanner sc) {
        System.out.println("Would you like to play again? (y/n)");
        String playAgainOption = sc.nextLine().toLowerCase();
        if (playAgainOption.equals("n")) {
            System.out.println("Thanks for playing");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wordle w = new Wordle();
        boolean playAgain = true;
        while (playAgain) {
            String solution = w.words().toLowerCase();
            System.out.println("Welcome, Enter a word ");
            int count;
            for (int j = 0; j < 6; j++) {
                char[] userInput = new char[5];

                boolean validInput = false;
                while (!validInput) {
                    String word = sc.nextLine().toLowerCase();
                    if (word.length() == 5) {
                        for (int i = 0; i < word.length(); i++) {
                            userInput[i] = word.charAt(i);
                        }
                        validInput = true;
                    } else {
                        System.out.println("Please enter 5 lettered word");
                    }
                }

                count = w.play(userInput, solution);
                if (count == 5) {
                    System.out.println("You won!");
                    playAgain = w.playAgain(sc);
                    break;
                } else if (j == 5) {
                    System.out.println("You lost!");
                    System.out.println("Answer was " + solution);
                    playAgain = w.playAgain(sc);
                }
            }
        }
    }
}
