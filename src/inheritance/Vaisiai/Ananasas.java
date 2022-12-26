package inheritance.Vaisiai;

class Ananasas extends EgzotinisVaisius {
    @Override
    String kasAsEsu() {
        return String.format("ananasas %s", super.kasAsEsu());
    }
}
