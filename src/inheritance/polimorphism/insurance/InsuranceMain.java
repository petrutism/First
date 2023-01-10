package inheritance.polimorphism.insurance;

public class InsuranceMain {
    public static void main(String[] args) {

        Insurance kasko = new KASKOinsurance("Andrius Baltrunas", 550d, "LT", "LIB965", 120d);
        Insurance tpvca = new TPVCAinsurance("Petras Petraitis", 120d, "LT", "ABC123");
        System.out.println("Apdraustasis: " + kasko.getInsuredPerson());
        System.out.println("Suma: " + kasko.getSum());
        System.out.println("-----------------");
        System.out.println("Apdraustasis: " + tpvca.getInsuredPerson());
        System.out.println("Suma: " + tpvca.getSum());
        System.out.println("-----------------");

        System.out.println(((CarInsurance)kasko).getCarnumber());
        System.out.println(((CarInsurance)tpvca).getCarnumber());

        System.out.println("-----------------");

        if(kasko instanceof KASKOinsurance insurance){
            System.out.println(insurance.getFranchise());
        }
    }
}
