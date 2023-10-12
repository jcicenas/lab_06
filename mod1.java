/**
 * mod1
 */
import java.util.*;
public class mod1 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        boolean sentinel = true;
        double temp = 0;
        do {
            System.out.println("Please enter a temperature in degress C to be converted to F");
            if(newscan.hasNextInt()){
                temp = newscan.nextInt();
                sentinel = false;
                System.out.println(temp);
            }
        } while (sentinel == true);
        System.out.printf("%-20s%5.2f%n","Degrees C:" ,(temp * (9/5)) + 32);
        System.out.printf("%-20s%5.2f%n","Degrees F: ",(temp * (9/5)) + 32);
        newscan.close();
    
    }
    
}