import java.util.Random;

public class Jar {
  
  final private String item;
  final private int max_quantity;
  private int quantity;
  private int guessCount;
  private boolean isWon;
  
  public Jar (String item, int max_quantity) {
    this.item = item;
    this.max_quantity = max_quantity;
    this.guessCount = 0;
    this.isWon = false;
    fill();
  }
  
  // Returns the type of item in the jar
  public String getItem() {
    return item; 
  }
  
  // Returns the maximum quantity of items in the jar
  public int getMaxQuantity() {
    return max_quantity; 
  }
  
  // Return the actual quantity of items in the jar
  public int getQuantity() {
    return quantity; 
  }
  
  // Return the number of user guesses
  public int getGuessCount() {
    return guessCount; 
  }
  
  // Sets quantity to a random number between 1 and the maximum quantity
  public void fill() {
    Random random = new Random();
    quantity = random.nextInt(max_quantity) + 1;
  }
  
  // Determines if guess was correct and return proper boolean
  public String applyGuess(int guess) {
    
    if (guess > max_quantity) {
      return "Your guess must be less than " + max_quantity;
    } else if (guess == quantity) {
      guessCount += 1;
      isWon = true;
      return "You win!";   
    } else if (guess < quantity) {
      guessCount += 1;
      return "Your guess is too low";
    } else {
      guessCount += 1;
      return "Your guess is too high";
    }
  }
  
  // return the status of the game
  public boolean getIsWon() {
     return isWon;
  }
}