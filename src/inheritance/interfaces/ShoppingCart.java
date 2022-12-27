package inheritance.interfaces;

import inheritance.Person;

public class ShoppingCart implements Cart {
    @Override
    public void printCartInfo() {
        System.out.println("Krepselio total ammount= " + getCartAmmount());
    }

    @Override
    public double getCartAmmount() {
        return 999.09;
    }
}
