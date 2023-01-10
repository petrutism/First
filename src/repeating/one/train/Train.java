package repeating.one.train;

import java.sql.SQLOutput;
import java.util.Set;

class Train extends Transport {
    Train(int maxSeats) {
        super(maxSeats);
    }

    @Override
    void addPassenger(Passenger passenger) throws TrainExeption {
        if (state.equals(TrainState.MOVING)) {
            throw new TrainExeption("Cannot add passenger - train is moving...");
        }
        if (isTransportFull()) {
            throw new TrainExeption("Cannot add passenger - train is full...");
        }
        passengers.add(passenger);
    }

    @Override
    void removePassenger(Passenger passenger) throws TrainExeption {
        if (state.equals(TrainState.MOVING)) {
            throw new TrainExeption("Cannot remove passenger - train is moving...");
        }
    }

    @Override
    void printPassengers() {
        System.out.println(passengers);
    }
}
