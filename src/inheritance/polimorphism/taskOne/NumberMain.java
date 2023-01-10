package inheritance.polimorphism.taskOne;

public class NumberMain {
    public static void main(String[] args) {
        NumberMain numberMain = new NumberMain();
        //Skaicius skaicius = new TeigiamasSkaicius(200, 20, 50);
        //Skaicius skaicius = new LyginisSkaicius(200, 20, 50);
        //Skaicius skaicius = new NelyginisSkaicius(200,20,50);
        Skaicius skaicius = new NeigiamasSkaicius(200,20,50);

        numberMain.run(skaicius);
    }

    private void run (Skaicius skaicius){
        skaicius.generuok();
        System.out.println("suma: " + skaicius.suma());
        System.out.println(skaicius.numbers.size());
    }
}
