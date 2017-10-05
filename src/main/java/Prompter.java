import java.util.Scanner;

public class Prompter {
  
  private Jar jar;
  
  // Prompt for jar configuration and assign new jar to prompter
  public void setUpJar() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("What type of item is in the jar contains? ");
    String item = scanner.nextLine();
    System.out.printf("What is the maximum amount of %s? ", item);
    int max_quantity = Integer.parseInt(scanner.nextLine());
    jar = new Jar(item, max_quantity);
    System.out.printf("%n------------------------------------------------%n%n");
  }
  
  // Display the initial guess prompt
  public void displayInitialPrompt() {
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d%n", 
                        jar.getItem(), jar.getMaxQuantity()); 
  }
  
  // Take and analyze user input and provide feedback if incorrect
  public boolean makeGuess() {
      Scanner scanner = new Scanner(System.in);
      int guess = Integer.parseInt(scanner.nextLine());
      String guessResult = jar.applyGuess(guess);
      System.out.println(guessResult); 
      return jar.getIsWon();
  }
  
  // Display final message including how many guesses the user took
  public void displayFinalMessage() {
    System.out.printf("You got it in %d attempts%n", jar.getGuessCount()); 
  }
}