package inheritance.polimorphism.taskOne;

import java.util.Random;

public class NelyginisSkaicius extends Skaicius {

    public NelyginisSkaicius(int maxInterval, int minInterval, int maxGenNumb) {
        super(maxInterval, minInterval, maxGenNumb);
    }

    @Override
    public void generuok() {
        Random random = new Random();
        do {
            int randNumb = random.nextInt(minInterval, maxInterval + 1);
            if (randNumb % 2 != 0) {
                System.out.println(randNumb);
                numbers.add(randNumb);
            }
        } while (numbers.size() < maxGenNumb);
    }
}
