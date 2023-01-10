package nullexample;

public class Main {
    public static void main(String[] args) {
        Address adresas = new Address(new Town("Kaunas"));
        System.out.println(getCityName(adresas));

    }

    static String getCityName(Address address) {
        Town town = null;

        if (address != null) {
            town = address.getTown();
        }
        if (town != null){
        return town.getName();
        }
        return null;
    }
}
