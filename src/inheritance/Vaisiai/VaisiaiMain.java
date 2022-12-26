package inheritance.Vaisiai;

class VaisiaiMain {
    public static void main(String[] args) {
        Vaisius vaisius = new Vaisius();
        EgzotinisVaisius egzotinisVaisius = new EgzotinisVaisius();
        LietuviskasVaisius lietuviskasVaisius = new LietuviskasVaisius();
        Ananasas ananasas = new Ananasas();
        Mangas mangas = new Mangas();
        Kriause kriause = new Kriause();
        Obuolys obuolys = new Obuolys();
        Alyvinis alyvinis = new Alyvinis();
        Antaninis antaninis = new Antaninis();

        System.out.println(vaisius.kasAsEsu());
        System.out.println(egzotinisVaisius.kasAsEsu());
        System.out.println(lietuviskasVaisius.kasAsEsu());
        System.out.println(ananasas.kasAsEsu());
        System.out.println(mangas.kasAsEsu());
        System.out.println(kriause.kasAsEsu());
        System.out.println(obuolys.kasAsEsu());
        System.out.println(alyvinis.kasAsEsu());
        System.out.println(antaninis.kasAsEsu());
    }
}
