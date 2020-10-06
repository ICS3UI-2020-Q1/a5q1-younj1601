import java.util.Scanner;
/**
 *Create a multiplication table for an inserted number
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the interger
    System.out.println("Please enter an integer to create a multiplication table for");
    int num = input.nextInt();

    //initialize variables for loop
    int answer;

    //for loop
    for(int count = 1; count <= 12; count++){
      answer = num*count;
      System.out.println(count + " x " + num + " = " + answer);

    }
    
    
  }
}
