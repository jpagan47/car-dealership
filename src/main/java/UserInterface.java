public class UserInterface {
    private Dealership dealership;

    public UserInterface(){
        this.dealership = DealershipFileManager.getDealership();
    }
}
