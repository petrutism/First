package inheritance.Vaisiai;

class Mangas extends EgzotinisVaisius {
    @Override
    String kasAsEsu() {
        return String.format("mangas %s", super.kasAsEsu());
    }
}
