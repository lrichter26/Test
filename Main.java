import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter question:");
    String question = scan.nextLine();
    // Get a random number from 1 to 8
    int rand = (int) (Math.random()*8);
    // Use if statements to test the random number
    if (rand == 0) {
        System.out.println("Yes");
    }
    else if (rand == 1) {
        System.out.println("No");
    }
    else if (rand == 2) {
        System.out.println("Maybe");
    }
    else if (rand == 3) {
        System.out.println("Probably not");
    }
    else if (rand == 4) {
        System.out.println("Perhaps");
    }
    else if (rand == 5) {
        System.out.println("Definitely");
    }
    else if (rand == 6) {
        System.out.println("Never");
    }
    else if (rand == 7) {
        System.out.println("Probably");
    }
    else {
        System.out.println("Error!");
    // and print out 1 of 8 random responses
    }
  }
}