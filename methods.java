import java.util.Scanner;  // lets us read user input from the keyboard

public class DistanceConverter {

    // Converts miles to kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.61;
    }

    // Converts kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner for user input

        System.out.print("Enter the distance: ");
        double distance = input.nextDouble(); // get the distance number

        System.out.print("Is the distance in miles or kilometers? ");
        String unit = input.next().toLowerCase(); // read and lowercase the unit

        if (unit.equals("miles")) {
            double kilometers = milesToKilometers(distance); // call conversion function
            System.out.println(distance + " miles = " + kilometers + " kilometers");
        } 
        else if (unit.equals("kilometers")) {
            double miles = kilometersToMiles(distance); // call conversion function
            System.out.println(distance + " kilometers = " + miles + " miles");
        } 
        else {
            System.out.println("Please type 'miles' or 'kilometers'."); // invalid input
        }

        input.close(); // always close Scanner when done
    }
}
