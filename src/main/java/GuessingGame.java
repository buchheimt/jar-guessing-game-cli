public class GuessingGame {
  
  public static void main(String[] args) {
    Prompter prompter = new Prompter();
    prompter.setUpJar();
    prompter.displayInitialPrompt();
    boolean correctGuess;
    do {
      correctGuess = prompter.makeGuess();
    } while (!correctGuess);
    prompter.displayFinalMessage();
  }
}
