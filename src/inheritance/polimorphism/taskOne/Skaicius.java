package inheritance.polimorphism.taskOne;

import java.util.ArrayList;
import java.util.List;

public abstract class Skaicius {
    protected final List<Integer> numbers;
    protected final int maxInterval;
    protected final int minInterval;
   protected final int maxGenNumb;

    public Skaicius(int maxInterval, int minInterval, int maxGenNumb) {
        this.maxInterval = maxInterval;
        this.minInterval = minInterval;
        this.maxGenNumb = maxGenNumb;
        numbers = new ArrayList<>();
    }

    public abstract void generuok();

    public int suma (){
        int sum = 0;
        for (Integer numb : numbers){
            sum += numb;
        }
        return sum;
    }

}
