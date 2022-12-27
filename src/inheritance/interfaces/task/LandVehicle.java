package inheritance.interfaces.task;

public interface LandVehicle extends Vehicle{
    int getNumbWheels();

    void setNumbWheels (int numbOfWheels);

    void drive();
}
