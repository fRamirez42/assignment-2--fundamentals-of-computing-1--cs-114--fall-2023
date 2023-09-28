import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int number = 0;

    System.out.println("Enter a number: ");

    number = scan.nextInt();

    if(number > 0){

      if(number % 2 == 0){

        System.out.println("Its Even!");

      } else {

        System.out.println("Its odd");

      }
    }

  }
}
