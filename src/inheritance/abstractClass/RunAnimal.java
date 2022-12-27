package inheritance.abstractClass;

public class RunAnimal {
    public static void main(String[] args) {
        Dog kola = new Dog(10);
        kola.info();
        kola.makeSound();

        Animal juockis = new Cat(10);
        juockis.getAge();
        juockis.makeSound();
        juockis.info();



    }
}
