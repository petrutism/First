package inheritance.abstractClass;

public class Cat extends Animal {

    private final int age;

    public Cat (int age){
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Mew Mew...");
    }

    @Override
    public int getAge() {
        return age;
    }
}
