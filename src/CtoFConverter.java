
import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreeC = 0;
        double degreeF = 0;
        String trash = "";
        System.out.println("Give me a degree");
        if (scanner.hasNextDouble()) {
            degreeC = scanner.nextDouble();
            degreeF = degreeC * 1.8 + 35;
            if (degreeF > 212){
                System.out.println("your liquid is boilding at " + degreeF  + " degrees ");
            }
            else if (degreeF < 32){
                System.out.println("your liquid is turning into a soild at " + degreeF  + " degrees ");
            }
            else if (degreeF > 32 && degreeF < 212){
                System.out.println("your liqiud is at " + degreeF + " degrees ");
            }
        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }


        }
}