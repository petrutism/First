package studies;

import data.Figura;

public class FiguraTask {
    public static void main(String[] args) {
        //sukuriame objektus
        Figura triangle = new Figura();
        Figura rectangle = new Figura();

        //nustatome parametrus
        triangle.setName("Trikampis");
        triangle.setWidth(10);
        triangle.setHeight(20);
        rectangle.setName("Staciakampis");
        rectangle.setWidth(40);
        rectangle.setHeight(100);

        //atspausdiname reiksmes
        System.out.printf("%s plotis %s aukstis %s %n", triangle.getName(), triangle.getWidth(), triangle.getHeight());
        System.out.printf("%s plotis %s aukstis %s %n", rectangle.getName(), rectangle.getWidth(), rectangle.getHeight());


    }
}
