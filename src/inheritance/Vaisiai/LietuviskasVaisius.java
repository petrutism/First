package inheritance.Vaisiai;

class LietuviskasVaisius extends Vaisius {
    @Override
    String kasAsEsu() {
        return String.format("lietuviskas %s", super.kasAsEsu());
    }
}
