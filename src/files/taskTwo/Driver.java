package files.taskTwo;

class Driver {
    private final String name;
    private final String car;
    private final String number;
    private final String mileage;

    public Driver(String name, String car, String number, String mileage) {
        this.name = name;
        this.car = car;
        this.number = number;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public String getNumber() {
        return number;
    }

    public String getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car='" + car + '\'' +
                ", number='" + number + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
