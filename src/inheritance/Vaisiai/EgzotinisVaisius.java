package inheritance.Vaisiai;

class EgzotinisVaisius extends Vaisius {

    @Override
    String kasAsEsu (){
        return String.format("egzotinis %s", super.kasAsEsu());
    }
}
