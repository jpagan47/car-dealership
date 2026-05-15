import java.util.ArrayList;

public class Dealership {

    // Ask Dave why when I construct my toString it adds this @Override
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", phone='" + phone + '\'' +
                        ", inventory+" + inventory;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }
    public Dealership(){

    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public void removeVehicle() {

    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory)
            if (v.getPrice() <= max && v.getPrice() >= min) {
                vehicles.add(v);
            }
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory)
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                vehicles.add(v);
            }
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory)
            if (v.getYear() <= max && v.getYear() >= min) {
                vehicles.add(v);
            }
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory)
            if (v.getColor().equalsIgnoreCase(color)) {
                vehicles.add(v);
            }
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory)
            if (v.getOdometer() <= max && v.getOdometer() >= min) {
                vehicles.add(v);
            }
        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByType(String typeOfVehicle) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle v : this.inventory)
            if (v.getVehicleType().equalsIgnoreCase(typeOfVehicle)) {
                vehicles.add(v);
            }
        return vehicles;
    }


}
