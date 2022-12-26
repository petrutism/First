package inheritance.Vaisiai;

class Alyvinis extends Obuolys {
    @Override
    String kasAsEsu() {
        return String.format("alyvinis %s", super.kasAsEsu());
    }
}
