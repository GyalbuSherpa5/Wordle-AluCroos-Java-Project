package wordle;

import java.util.Scanner;

class Wordle {
    public String[] words() {
        String[] word = {"ABACK", "ABOVE", "ADMIT", "ADOPT", "ADORE",
                "BIRTH", "BELLY", "BENCH", "CHOKE", "CHORD", "CHUNK", "ENJOY", "EPOCH", "FAULT", "FAVOR", "FEAST",
                "GAMER", "GREAT", "GREET", "HUMAN", "HUMOR", "HORSE", "JUDGE", "KARMA", "IONIC", "IRONY", "ITCHY",
                "LOFTY", "LOOPY", "LOSER"};
        return word;
    }

    public int play(char[] character) {

        char[] answer = {'s', 't', 'a', 'l', 'k'};

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
                        System.out.print("| " + Color.GREEN_BOLD + character[i] + Color.RESET + " | ");
                        flag = false;
                        count++;
                        break;
                    }
                    System.out.print("| " + Color.YELLOW_BOLD + character[i] + Color.RESET + " | ");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print("| " + Color.RED_BOLD + character[i] + Color.RESET + " | ");
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("+---+ ");
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Wordle w = new Wordle();

        for (int j = 0; j < 6; j++) {
            char[] userInput = new char[5];
            Scanner sc = new Scanner(System.in);

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
            int count = w.play(userInput);
            if (count == 5) {
                System.out.println("You won!");
                break;
            }
        }
    }
}