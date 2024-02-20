import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNum =rand.nextInt(10)+1;
        int userGuess = 0;
        String trash = "";
        System.out.println("guess a number");
        if (scanner.hasNextInt()){
            userGuess = scanner.nextInt();
            if (userGuess==randomNum){

                System.out.println("You win!");

            }
            else if (userGuess > randomNum){
                System.out.println("you need to guess lower");
            }
            else{

                System.out.println("you need to guess higher");

            }
        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }

    }
}
