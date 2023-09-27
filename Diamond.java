import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");

    int number = 0;

    int m;

    int n;

    try{

    number = scan.nextInt();

    }catch(Exception e){

      System.out.println("Error: Please enter an integer value");

    }

    if(number > 0){

      if(number % 2 == 0){

        System.out.println("Its Even!");

      } else {

        System.out.println("Its odd");


        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (m = number - 1; m > 0; m--) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
          }
        }


      }
    }

  }
