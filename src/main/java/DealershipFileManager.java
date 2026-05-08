public class DealershipFileManager {
    public static Dealership getDealership() {
        //read first line of the file
        Dealership dealership = new Dealership(name, address , phoneNumber);

        // for each additional line of the file, it's a vehicle
        dealership.addVehicle(vehicle);
        return dealership;
    }
}
