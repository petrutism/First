package inheritance.abstractClass.taskCars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Transport {
    private final LocalDate registrationDate;

    private final String color;

    Transport (LocalDate registrationDate, String color){
        this.registrationDate = registrationDate;
        this.color = color;
    };

    public void printRegistrationDate (){
        System.out.println(registrationDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
    }

    public String getColor() {
        return color;
    }

    public abstract void go ();

}
