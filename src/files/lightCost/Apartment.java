package files.lightCost;

record Apartment(int number, int size, int persons) {

    @Override
    public String toString() {
        return "Apartment{" +
                "number=" + number +
                ", size=" + size +
                ", persons=" + persons +
                '}';
    }
}
