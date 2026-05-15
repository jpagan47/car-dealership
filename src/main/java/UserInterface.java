import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner myScanner = new Scanner(System.in);

    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    public UserInterface() {

    }

    public void display() {

        init();
        boolean running = true;
        while (running) {
            System.out.println("""
                    ---Main Menu---
                    1. Search By Price
                    2. Search by Make and Model
                    3. Search by Year
                    4. Search by Color
                    5. Search by Mileage
                    6. Search by Vehicle Type
                    7. All Vehicles
                    8. Add Vehicle 
                    9. Remove Vehicle 
                    10. Exit 
                    --End Of Menu--
                    """);

            int userInput = Integer.parseInt(myScanner.nextLine());
            switch (userInput) {
                case 1:
                    getByPrice();
                    break;
                case 2:
                    getByMakeModel();
                    break;
                case 3:
                    getByYear();
                    break;
                case 4:
                    getByColor();
                    break;
                case 5:
                    getByMileage();
                    break;
                case 6:
                    getByVehicleType();
                    break;
                case 7:
                    getAllVehicles(dealership.getAllVehicles());
                    break;
                case 8:
                    addVehicle();
                    break;
                case 9:
                    removeVehicle();
                    break;
                case 10:
                    System.out.println("""
                            \n
                            ==========
                            END OF APPLICATION
                            ==========
                            \n
                            """);
                    running = false;
                    break;
                default:
            }
        }


    }


    private void getByPrice() {
        System.out.print("Enter minimum price: ");
        double minPrice = Double.parseDouble(myScanner.nextLine());
        System.out.print("Enter maximum price: ");
        double maxPrice = Double.parseDouble((myScanner.nextLine()));

        ArrayList<Vehicle> matchingVehicles = dealership.getAllVehicles()
    }

    private void getByMakeModel() {
    }

    private void getByYear() {
    }

    private void getByColor() {
    }

    private void getByMileage() {
    }

    private void getByVehicleType() {
    }

    private void getAllVehicles(ArrayList<Vehicle> vehicles) {

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }

    }

    private void addVehicle() {
        System.out.print("Enter VIN: ");
        int vin = Integer.parseInt(myScanner.nextLine());

        System.out.print("Enter Year: ");
        int year = Integer.parseInt(myScanner.nextLine());

        System.out.print("Enter Make: ");
        String make = myScanner.nextLine();

        System.out.print("Enter Model: ");
        String model = myScanner.nextLine();

        System.out.print("Enter Type: ");
        String type = myScanner.nextLine();

        System.out.print("Enter Color: ");
        String color = myScanner.nextLine();

        System.out.print("Enter odometer: ");
        int odometer = Integer.parseInt(myScanner.nextLine());

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(myScanner.nextLine());

        Vehicle vehicle = new Vehicle(vin,year,make,model,type,color,odometer,price);
        dealership.addVehicle(vehicle);
        System.out.println("Vehicle Successfully Added!!");
    }

    private void removeVehicle() {

    }


}
