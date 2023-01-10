package repeating.one.train;

import java.util.HashSet;
import java.util.Set;

abstract class Transport {
    protected Set<Passenger> passengers;
    protected final int maxSeats;
    protected TrainState state;


    Transport(int maxSeats) {
        this.maxSeats = maxSeats;
        state = TrainState.STOPPED;
        passengers = new HashSet<>();
    }

    abstract void addPassenger(Passenger passenger);

    abstract void removePassenger(Passenger passenger);

    abstract void printPassengers();

    void stopMoving() {
        state = TrainState.STOPPED;
        System.out.println("Vehicle is stopped...");
    }
    void startMoving() {
        state = TrainState.MOVING;
        System.out.println("Vehicle is moving...");
    }

    boolean isTransportFull(){
        return maxSeats == passengers.size();
    }

}
