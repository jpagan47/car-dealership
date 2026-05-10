import java.util.ArrayList;

public class Dealership {
    // Ask Dave why when I construct my toString it adds this @Override
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory;
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



    public void addVehicle(Vehicle vehicle) {

        inventory.add(vehicle);
    }

    public  ArrayList<Vehicle> getAllVehicles() {
//        for (Vehicle v : inventory){
//            System.out.println(v.getVin() + "|" + v.getYear() + "|" + v.getMake() + "|" + v.getModel() + "|"+v.getOdometer() + "|" + v.getPrice());
//        }
        return inventory;
    }

    public void removeVehicle(){

    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String typeOfVehicle) {

        return null;
    }


}
