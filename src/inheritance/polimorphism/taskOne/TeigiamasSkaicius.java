package inheritance.polimorphism.taskOne;

import java.util.Random;

public class TeigiamasSkaicius extends Skaicius{

    public TeigiamasSkaicius(int maxInterval, int minInterval, int maxGenNumb) {
        super(maxInterval, minInterval, maxGenNumb);
    }

    @Override
    public void generuok() {
        Random random = new Random();
        for (int i = 0; i < maxGenNumb; i++){
            int randNumb = random.nextInt(minInterval, maxInterval+1);
            System.out.println(randNumb);
            numbers.add(randNumb);
        }
    }
}
