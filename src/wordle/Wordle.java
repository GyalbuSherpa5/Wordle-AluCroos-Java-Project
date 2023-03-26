package wordle;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Wordle {

    public static String arr="rupes";

    //converting string to character
    public static char[]  arr1=arr.toCharArray();

    public static char[]  arr2=new char[arr1.length];

    public static String[] arr3=new String[arr1.length];

    //Ansi for using the color in java
    public static final String	BLACK				= "\u001B[30m";
    public static final String	RED					= "\u001B[31m";
    public static final String	GREEN				= "\u001B[32m";
    public static final String	YELLOW				= "\u001B[33m";


    public static int count=0;


    public static void main(String[] args){
        int flag=1;


        //for showing the pattern
      while(flag==1){

          do{
              pattern(count);


              Scanner sc=new Scanner(System.in);

              System.out.println("Input your string");

              String input=sc.nextLine();

              checkWord(input);

              outFormatter(arr3);

              if(Arrays.equals(arr1,arr2)){

                  System.out.println("IF you want to play again enter 1 or 0 if not.");
                  flag=sc.nextInt();
                  count=0;

                  break;
              }

          }
          while(count<6);
      }
    }

    public static void pattern(int n){
        int i=0;
        System.out.println("");
        if(n<=5) {
            for ( i = 0; i < 5; i++) {
                System.out.print("+---+ ");
            }
            System.out.println("");
            for( i=0;i<5;i++){

                System.out.print("|" + "   " +  " |");
            }
            System.out.println("");
            for(  i=0;i<5;i++){
                System.out.print("+---+ ");
            }
            pattern(n + 1);
        }

    }

    public static void outFormatter(String[] str){


        for(int i=0; i<5; i++){
            System.out.print("+---+ ");
        }
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print("| "+str[i]+" | ");
        }
        System.out.println();
        for(int i=0; i<5; i++) {
            System.out.print("+---+ ");
        }

    }
    public static void checkWord(String input){

        count +=1;


        arr2=input.toCharArray();


        for(int j=0;j<arr2.length;j++){

            char a=arr2[j];
            String n=BLACK + a;

            for(int k=0;k<arr2.length;k++){

                if(a==arr1[k] && j==k){

                    n= GREEN + a;
                    arr3[j]=n;
                    break;


                }
                else if(a==arr1[k] && j!=k){
                    n= YELLOW + a ;
                    arr3[j]=n;

                    break;
                }
                arr3[j]=n;
            }

        }

    }
}
