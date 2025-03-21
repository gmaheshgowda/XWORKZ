public class Hospital {
    int id;
    String name;
    String location;
    int noOfDoctors;
    int noOfBeds;

    Hospital(int id, String name, String location, int noOfDoctors, int noOfBeds) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.noOfDoctors = noOfDoctors;
        this.noOfBeds = noOfBeds;
    }
}