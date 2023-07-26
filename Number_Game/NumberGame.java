import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    NumberGame()
    {
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }

   void takeUserInput()
   {
       System.out.println("Guess the number");
       Scanner sc=new Scanner(System.in);
       inputNumber=sc.nextInt();
   }
   boolean isCorrectNumber()
   {
       noOfGuesses++;
       if(inputNumber==number)
       {
           System.out.format("You guessed it right,it was %d\nYou guessed it in %d attempts",number,noOfGuesses);
           return true;
       } else if (inputNumber<number) {
           System.out.println("Too low...");
       } else {
           System.out.println("Too high...");
       }
       return false;
   }
    public static void main(String[] args) {
        NumberGame g=new NumberGame();
        boolean b=false;

            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
            }
    }
}