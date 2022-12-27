package inheritance.abstractClass;

public abstract class Animal {

    public abstract void makeSound ();

    public abstract int getAge();
    public void info () {
        System.out.printf("Animal age is: %s%n", getAge());
    }

    }

