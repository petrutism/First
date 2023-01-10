package exeptions.planetask;

public class ExpandChassisExeption extends Exception{
    private final String reason;

    public ExpandChassisExeption(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
