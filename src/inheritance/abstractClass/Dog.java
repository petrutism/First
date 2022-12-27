package inheritance.abstractClass;

public class Dog extends Animal {

    private final int age;

    public Dog (int age){
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Barking...");

    }

    @Override
    public int getAge() {
        return age;
    }
}
