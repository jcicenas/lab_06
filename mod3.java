import java.util.*;
public class mod3 {
    public static void main(String[] args) {
        double height = 0, length = 0;
        Scanner scan = new Scanner(System.in);
        boolean sentinel = true;
        do {
            System.out.println("Enter the length of a rectangle: ");
            if(scan.hasNextDouble()){
                length = scan.nextDouble();
                if(length > 0){
                    sentinel = false;
                }
            }
        } while (sentinel == true);
        sentinel = true;
        do {
            System.out.println("Enter the height of a rectangle: ");
            
            if(scan.hasNextDouble()){
                height = scan.nextDouble();
                if(height > 0){
                    sentinel = false;
                }

            }
        } while (sentinel == true);
        System.out.printf("%-20s%5.2f%n", "Side 1: ", height);
        System.out.printf("%-20s%5.2f%n", "Side 2: ", length);
        System.out.printf("%-20s%5.2f%n","Perimeter: ", ((2*length) + (2*height)));
        System.out.printf("%-20s%5.2f%n","Area: ", (length*height));
        System.out.printf("%-20s%5.2f%n","Diagonal: ", Math.sqrt((Math.pow(height, 2)) + (Math.pow(length, 2))));
        scan.close();
    }
    
}
