import java.util.Scanner;

public class gamemode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char[][] arr = new char[3][3];
        int count=0;
        char sym;
        pattern p = new pattern(arr);
        p.pat();
        u:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the position");


                int set = sc.nextInt();
                count++;
                if(count%2==0){
                    sym='X';
                }
                else{
                    sym='O';
                }

                switch (set) {

                    case 7 -> {
                        if(arr[0][0]=='\0')
                            arr[0][0] = sym;
                             else{
                                j--;
                                count--;

                        }

                    }
                    case 8 -> {
                        if (arr[0][1] == '\0')
                            arr[0][1] = sym;
                        else{j--;
                        count--;}
                    }

                    case 9 -> {
                        if (arr[0][2] == '\0')
                        arr[0][2] = sym;
                        else{j--;
                        count--;}
                    }
                    case 4 ->{
                    if (arr[1][0] == '\0')arr[1][0] = sym;
                    else{j--;
                    count--;}}
                    case 5 -> {if (arr[1][1] == '\0')arr[1][1] = sym;
                    else{
                        j--;
                        count--;
                    }}
                    case 6 -> {if (arr[1][2] == '\0')arr[1][2] = sym;
                    else{j--;
                    count--;}}
                    case 1 -> {if (arr[2][0] == '\0')arr[2][0] = sym;
                    else{j--;
                    count--;}}
                    case 2 -> {if (arr[2][1] == '\0')arr[2][1] = sym;
                    else{j--;
                    count--;}}
                    case 3 -> {if (arr[2][2] == '\0')arr[2][2] = sym;
                    else{j--;
                    count--;}}
                }

                if(count>2) {
                    if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;

                    }
                    if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') {
                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;

                    }
                    if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;

                    }
                    if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') {
                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;

                    }
                    if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;

                    }
                    if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') {

                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;

                    }

                    if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;

                    }
                    if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') {
                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;

                    }

                    if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;
                    }
                    if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {
                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;
                    }


                    if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;
                    }
                    if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;
                    }

                    if (arr[2][0] == 'X' && arr[1][1] == 'X' && arr[0][2] == 'X') {
                        System.out.println("Player Wins");
                        p.pat();
                        break u;
                    }
                    if (arr[2][0] == 'O' && arr[1][2] == 'O' && arr[0][2] == 'O') {
                        System.out.println("Player2 Wins");
                        p.pat();
                        break u;
                    }

                }
                p.pat();



            }



        }


        System.out.println();


    }

}
