import java.util.*;


public class mod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sentinel = true;
        double gas=0, fuel=0, price =0;

        do {
            System.out.println("Enter the number of gallons of gas in the tank.");
            if(scan.hasNextDouble() ){
                gas = scan.nextDouble();
                if(gas > 0){
                    sentinel = false;
                }
            }
        } while (sentinel == true);
        sentinel = true;
        do {
            System.out.println("Enter the fuel efficiency in miles per gallon: ");
            if(scan.hasNextDouble() ){
                fuel = scan.nextDouble();
                if(fuel > 0){
                    sentinel = false;
                }
            }
        } while (sentinel == true);
        sentinel = true;
        do {
            System.out.println("Enter the price of gas per gallon:");
            if(scan.hasNextDouble()){
                price = scan.nextDouble();
                if(price > 0){
                    sentinel = false;
                }
            }
        } while (sentinel == true);

        System.out.printf("%-40s%5.2f%n","Cost per 100 miles in $: ", (100 / fuel) * price);
        System.out.printf("%-40s%5.2f%n","Distance Left in Miles: ", gas * fuel);
        scan.close();
    }
}
