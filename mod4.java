import java.util.*;
public class mod4 {
    public static void main(String[] args) {
        double meters = 0;
        Scanner scan = new Scanner(System.in);
        boolean sentinel = true;
        do {
            System.out.println("Enter an amount in meters: ");
            if(scan.hasNextDouble()){
                meters = scan.nextDouble();
                if(meters > 0){
                    sentinel = false;
                }
            }
        } while (sentinel == true);

        System.out.printf("%-20s%5.2f%n", "Meters: ",meters);
        System.out.printf("%-20s%5.2f%n","Miles : ", meters * 0.00062137);
        System.out.printf("%-20s%5.2f%n","Feet: ", meters * 3.28084);
        System.out.printf("%-20s%5.2f%n","Inches: ", meters * 39.37008);
        scan.close();
    }
}
