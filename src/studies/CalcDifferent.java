package studies;

import data.CalcClasses;

public class CalcDifferent {
    public static void main(String[] args) {

        //objekto tipas - klases vardas
        //pavadinimas klases vardas is mazosios raides
        //new kuriame nauja tipa
        CalcClasses calcclasses = new CalcClasses(15.4, 78.6);

        //iskviesti - sukurto objekto vardas + metodo vardas
        System.out.println(calcclasses.rutulis());
        System.out.println(calcclasses.kvadratas());
        System.out.println(calcclasses.staciakampis());
        System.out.println(calcclasses.statTrikampis());

    }
}
