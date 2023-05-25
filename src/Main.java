public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Car", "car1", 4);
        Vehicle vehicle2 = new Vehicle("Car", "car2", 4);
        Vehicle vehicle3 = new Vehicle("Truck", "truck1", 6);
        Vehicle vehicle4 = new Vehicle("Truck", "truck2", 8);
        Vehicle vehicle5 = new Vehicle("Bicycle", "bicycle1", 2);
        Vehicle vehicle6 = new Vehicle("Bicycle", "bicycle2", 2);
        vehicle1.check(vehicle1);
    }
}
