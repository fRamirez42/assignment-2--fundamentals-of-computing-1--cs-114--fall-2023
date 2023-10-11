import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    //Variables

    Scanner scan = new Scanner(System.in);

    int inputNumber = 0;
    int stars = 1;
    int spaces = 0;

    System.out.println("Enter a number: ");
    inputNumber = scan.nextInt();
    scan.close();

    if(inputNumber > 0) {
      if(inputNumber % 2 == 0) {

        //Start of Even Diamond

        spaces = inputNumber-1; //Get the postion of first star

        for(int i = 0; i <= spaces; i++) {
          System.out.print(" "); //Creates the amount of spaces required to place the first star
        }

        System.out.println("*"); //Place first star
        spaces--;
        stars++;

        //Top Half of Diamond

        for(int row = 0; row < inputNumber/2; row++) {
          for(int columnSpace = 0; columnSpace <= spaces; columnSpace++) {
            System.out.print(" ");
          }
          for(int columnStar = 0; columnStar < stars; columnStar++) {
            System.out.print("* ");
          }

          spaces-=2;
          stars+=2;
          System.out.println();
        }

        /*End of last loop takes 2 spaces and adds 2 extra stars. We use these operation to reset the last loop, and add 2 to spaces and substract
        2 more to account for the next line. For a total of 4*/
        spaces+=4;;
        stars-=4;

        //Bottom hald of Diamond

        for(int row = 0; row < (inputNumber/2) - 1; row++) { //inputNumber divided by 2 to only do the bottom half. Substracted by 1 since the middle is already done.
          for(int columnSpace = 0; columnSpace <= spaces; columnSpace++) {
            System.out.print(" ");
          }
          for(int columnStar = 0; columnStar < stars; columnStar++) {
            System.out.print("* ");
          }
          spaces+=2;
          stars-=2;
          System.out.println();
        }

        for(int i = 0; i <= inputNumber - 1; i++) {
          System.out.print(" "); //Last star to finish of Even Diamond
        }

        System.out.println("*"); //Places last Star
      } else {
        //Start of Odd Diamond

        for(int i = 3; i <= inputNumber; i = i+2){
          spaces++; //Counts spaces needed to place first star
        }

        //Top half of Diamond

        for(int row = 0; row <= inputNumber/2; row++) {
          for(int columnSpace = 1; columnSpace <= spaces; columnSpace++) {
            System.out.print(" ");
          }
          for(int columnStar = 1; columnStar<= stars; columnStar++) {
            System.out.print("*");
          }

          System.out.println(" ");
          stars+=2;
          spaces--;
        }

        /*End of last loop substracts 1 space and adds 2 extra stars. We use these operation to reset the last loop, and add 2 to spaces and substract
        4 more to account for the next line*/
        stars-=4;
        spaces+=2;

        //Bottom half of Diamond

        for(int row = 0; row <= inputNumber/2; row++) {
          for(int columnSpace = 1; columnSpace <= spaces; columnSpace++) {
            System.out.print(" ");
          }
          for(int columnStar = 1; columnStar <= stars; columnStar++) {
            System.out.print("*");
          }

          System.out.println(" ");
          stars-=2;
          spaces++;
        }
      }
    }
  }
}
