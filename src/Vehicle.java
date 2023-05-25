public class Vehicle extends ServiceStation{
    private String type;
    private String modelName;
    private int wheelsCount;

    public Vehicle(String type, String modelName, int wheelsCount) {
        this.type = type;
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getType() {
        return type;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check(Vehicle vehicle) {
        String car = "Car";
        String truck = "Truck";
        if (car.equals(vehicle.getType())) {
            System.out.println("Обслуживаем " + vehicle.getType() + " " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
        } else if (truck.equals(vehicle.getType())) {
            System.out.println("Обслуживаем " + vehicle.getType() + " " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
            vehicle.checkTrailer();
        } else {
            System.out.println("Обслуживаем " + vehicle.getType() + " " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        }
    }
}
