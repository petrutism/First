package inheritance;

public class Policeman extends Person{
    private final String badgeNumber;

    public Policeman(String name, String surname, String badgeNumber) {
        super(name, surname);
        this.badgeNumber = badgeNumber;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public String toString (){
        return String.format("badgenumber: %s %s", badgeNumber, super.toString());
    }
}
