import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public static Dealership getDealership() {

        String filePath = "src/main/resources/inventory.csv";
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(filePath));

            // read dealership info first
            String line = bufferedReader.readLine();

            String[] parts = line.split("\\|");

            String name = parts[0];
            String address = parts[1];
            String phoneNumber = parts[2];

            Dealership dealership =
                    new Dealership(name, address, phoneNumber);

            // read vehicles
            while ((line = bufferedReader.readLine()) != null) {

                String[] vehicleParts = line.split("\\|");
                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String vehicleType = vehicleParts[4];
                String color = vehicleParts[5];
                int odometer = Integer.parseInt(vehicleParts[6]);
                double price = Double.parseDouble(vehicleParts[7]);

                // create vehicle
                Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                 dealership.addVehicle(vehicle);
            }
            bufferedReader.close();
            return dealership;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
