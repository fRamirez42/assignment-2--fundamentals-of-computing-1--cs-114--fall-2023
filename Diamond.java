import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int inputNumber = 0;

    int stars = 1;

    int spaces = 0;

    System.out.println("Enter a number: ");

    inputNumber = scan.nextInt();

    if(inputNumber > 0){

      if(inputNumber % 2 == 0){

        System.out.println("Its Even!");

      } else {

        if(inputNumber != 1){

          for(int i = 3; i <= inputNumber; i = i+2){

            spaces++;

          }

        }

        for(int i = 0; i <= inputNumber/2; i++)
        {

          for(int j = 1; j <= spaces; j++)
          {

            System.out.print(" ");

          }

          for(int j = 1; j<= stars; j++)
          {

            System.out.print("*");

          }

          System.out.println(" ");
          stars = stars + 2;
          spaces--;


        }

        stars = stars - 4;
        spaces = spaces + 2;

        for(int i = 0; i <= inputNumber/2; i++)
        {

          for(int j = 1; j <= spaces; j++)
          {

            System.out.print(" ");

          }

          for(int j = 1; j<= stars; j++)
          {

            System.out.print("*");

          }

          System.out.println(" ");
          stars = stars - 2;
          spaces++;


        }

      }
    }

  }
}
