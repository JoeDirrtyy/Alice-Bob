import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      while(true) {
          System.out.print("What's your name?: ");
          String name = scanner.nextLine();
          // System.out.println("Hello " + name + "!");
          if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
              System.out.println("Welcome " + name);
              break;
          } else {
              System.out.println("You are not Alice or Bob");
          }
      }
}




    }


