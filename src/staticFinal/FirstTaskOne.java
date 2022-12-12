package staticFinal;

class FirstTaskOne {
    private int i;

    void setValue (int i){
        System.out.println(i);
        this.i = i;
    }

    static void staticMethod(int j){
        //i = j; reiksmes priskirti negalime, nes i ne statinis
        System.out.println(j);
    }
}
