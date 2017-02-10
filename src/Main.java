import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);


        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.print("How many cars are you entering: ");
        int carsEntering = scan1.nextInt();

        ArrayList<Car> carList = new ArrayList<Car>();

        for (int i = 0; i < carsEntering; i++) {
            System.out.print("Enter Car #" + (i + 1) + " Make: ");
            scan1.nextLine();
            String make = scan1.nextLine();
            System.out.print("Enter Car #" + (i + 1) + " Model: ");
            String model = scan1.nextLine();
            System.out.print("Enter Car #" + (i + 1) + " Year: ");
            int year = scan1.nextInt();
            System.out.print("Enter Car #" + (i + 1) + " Price: ");
            double price = scan1.nextDouble();


            carList.add(new Car(make, model, year, price));
        }

        System.out.println();
        System.out.println("Current Inventory: ");

        for (Car c : carList) {
            System.out.println(c.toString());

        }


    }
}
