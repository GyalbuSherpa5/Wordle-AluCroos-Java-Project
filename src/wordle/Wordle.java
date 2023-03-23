package wordle;

import java.util.Scanner;
class Wordle {
    public void vaaa(char[] character){

        char answer[] = {'s','t','a','l','k'};


        for(int i=0; i<5; i++){
            System.out.print("+---+ ");
        }
        System.out.println();
        for(int i=0; i<5; i++){
            boolean flag = true;
            for(int j=0; j<5; j++){
                if(character[i]==answer[j]){
                    System.out.print("| "+Color.YELLOW+character[i]+Color.RESET+" | ");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print("| "+Color.RED+character[i]+Color.RESET+" | ");
            }
        }
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print("+---+ ");
        }
    }
    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
//                't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char userInput[] = new char[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            char line = sc.next().charAt(0);
            userInput[i] = line;
        }
        Wordle w = new Wordle();
        w.vaaa(userInput);


    }

}