
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("", 0);
      System.out.println(repeated);
      String pyramid = createPyramid(0);
      String FizzBuzz = countTo(3);
      
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
       
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end
        String repeatedWord = "";
        
        while (times != 0) {
          repeatedWord += word + " ";
          times -= 1;
        }
        return repeatedWord;


    
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        // TODO: Implement this method
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines
        String numPyramid = "";
        int currentNum = 1;
        int printAmount = 1;

        while (currentNum <= maxNumber){
          while (printAmount <= currentNum){
            numPyramid += currentNum;
            printAmount += 1;
          }
          
          numPyramid += "\n";
          currentNum += 1;
          printAmount = 1;
        }
      
        return String.valueOf(numPyramid);
    }
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end
         int count = 1;
        String countTo = "";
        
        while (count <= maxNumber){
          if (count % 3 == 0 && count % 5 == 0){
            countTo = countTo + "FizzBuzz ";
          } else if (count % 3 == 0){
            countTo = countTo + "Fizz ";
          } else if (count % 5 == 0){
            countTo = countTo + "Buzz ";
          } else {
            countTo = countTo + count + " ";
          }
          count += 1;
        }
      
        return countTo;
    }
    
  
}