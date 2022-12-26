package inheritance.Vaisiai;

class Antaninis extends Obuolys {
    @Override
    String kasAsEsu() {
        return String.format("antaninis %s", super.kasAsEsu());
    }
}
