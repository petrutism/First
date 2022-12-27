package inheritance.interfaces;

public interface Cart {
    String type = "EMPTY CARD";
    void printCartInfo();
    double getCartAmmount();

    default void printDefaultInfo(){
        System.out.println("This is default method...");
    }

}
