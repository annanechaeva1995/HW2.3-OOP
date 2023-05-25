public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("car1", 4);
        Vehicle vehicle2 = new Car( "car2", 4);
        Vehicle vehicle3 = new Truck("truck1", 6);
        Vehicle vehicle4 = new Truck("truck2", 8);
        Vehicle vehicle5 = new Bicycle("bicycle1", 2);
        Vehicle vehicle6 = new Bicycle("bicycle2", 2);
        vehicle6.check();
        vehicle1.check();
        vehicle2.check();
        vehicle3.check();
        vehicle4.check();
        vehicle5.check();

    }
}
