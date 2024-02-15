import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gasGallons = 0;
        double fuelEff = 0;
        double priceGas = 0;
        double totalDis = 0;
        double totalCost = 0;
        String trash = "";
        System.out.println("how much gas u got in tank?");
        if (scanner.hasNextDouble()){
            gasGallons = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("whats you mpg?");
            if(scanner.hasNextDouble()){
                fuelEff = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("what the price per gallon?");
                if (scanner.hasNextDouble()){
                    priceGas = scanner.nextDouble();
                    scanner.nextLine();
                    totalCost = 100 * priceGas;
                    totalDis = fuelEff * gasGallons;
                    System.out.println("the cost of 100 miles is " + totalCost);
                    System.out.println("with the amount of gas in your car you will go " + totalDis);

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
        else{
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }

        }

    }

