import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double areaRec = 0;
        double premRec = 0;
        double num3 =0;
        double diagonalRec = 0;
        String trash = "";
        System.out.println("give first side");
        if (scanner.hasNextDouble()){
            num1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("second side?");
            if (scanner.hasNextDouble()){
                num2 = scanner.nextDouble();
                scanner.nextLine();
                areaRec = num1 * num2;
                premRec = 2 * num1 + num2;
                num3 = num1 * num1 + num2 * num2;
                diagonalRec = Math.sqrt(num3);
                System.out.println("The area is " + areaRec);
                System.out.println("The perimeter is " + premRec);
                System.out.println("The diagonal is " + diagonalRec);

            }
            else{
                trash = scanner.nextLine();
                System.out.println("your input is trash " + trash);
            }
        }
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }
    }



    }
