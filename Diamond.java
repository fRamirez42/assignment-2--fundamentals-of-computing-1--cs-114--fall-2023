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


        spaces = inputNumber-1;

        for(int i = 0; i <= spaces; i++)
        {

          System.out.print(" ");

        }
        System.out.print("*");

        System.out.println(" ");

        spaces--;

        stars++;

        for(int i = 0; i < inputNumber/2; i++)
        {

          for(int j =0; j <= spaces; j++)
          {

            System.out.print(" ");

          }

          for(int j = 0; j < stars; j++)
          {

            System.out.print("*");

            System.out.print(" ");

          }

          spaces = spaces - 2;

          stars = stars + 2;

          System.out.println();

        }

        spaces = spaces + 4;

        stars = stars - 4;


        for(int i = 0; i < (inputNumber/2)-1; i++)
        {

          for(int j =0; j <= spaces; j++)
          {

            System.out.print(" ");

          }

         for(int j = 0; j < stars; j++)
          {

          System.out.print("*");

          System.out.print(" ");

          }

          spaces = spaces + 2;

          stars = stars - 2;

          System.out.println();

        }

        for(int i = 0; i <= inputNumber - 1; i++)
        {

          System.out.print(" ");

        }

        System.out.print("*");

        System.out.println(" ");


      } else {

        if(inputNumber != 1){

          for(int i = 3; i <= inputNumber; i = i+2){

            spaces++; //Counts spaces needed

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

        //Resets the starting point
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
