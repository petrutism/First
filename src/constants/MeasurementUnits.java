package constants;

public enum MeasurementUnits {
    MILLIMETER (1000, "mm"),
    CENTIMETER (100, "cm"),
    METER (1,"m"),
    KILOMETER (0,"km");

    private final double unitValue;
    private final String unitName;

    MeasurementUnits(double unitValue, String unitName) {
        this.unitValue = unitValue;
        this.unitName = unitName;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public String getUnitName() {
        return unitName;
    }
}
