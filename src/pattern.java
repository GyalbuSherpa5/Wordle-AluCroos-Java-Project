import java.util.Scanner;

public class pattern {
    char arr[][];
    pattern(char arr[][]){
        this.arr=arr;

    }
    public void pat() {
        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j!=0) {
                    System.out.print("  |  ");
                }



                System.out.print(arr[i][j]+"----");

            }
            System.out.println("");
        }



    }
}
