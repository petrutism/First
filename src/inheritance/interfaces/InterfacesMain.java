package inheritance.interfaces;

import inheritance.abstractClass.taskCars.Car;

public class InterfacesMain {
    public static void main(String[] args) {
        Cart cart = new ShoppingCart();
        cart.printCartInfo();
        cart.printDefaultInfo();
        System.out.println(cart.type);
    }
}
