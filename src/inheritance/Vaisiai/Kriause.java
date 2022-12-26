package inheritance.Vaisiai;

class Kriause extends LietuviskasVaisius {
    @Override
    String kasAsEsu() {
        return String.format("kriause %s", super.kasAsEsu());
    }
}
