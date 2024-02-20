
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meterInput = 0;
        double miles = 0;
        double feet = 0;
        double inch =0;
        String trash = "";
        System.out.println("give me meters");
        if (scanner.hasNextDouble()){
            meterInput = scanner.nextDouble();
            miles = meterInput * 1609.34;
            feet = meterInput / 3.28084;
            inch = feet /12;
            System.out.println("Meter to miles is "+ miles);
            System.out.println("Meter to feet is "+ feet);
            System.out.println("Meter to inch is "+ inch);

        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }
    }

}
