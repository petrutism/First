package files.statistics;

public class Statistics {
    private final String nameSurname;
    private final String gender;
    private final String country;
    private final int money;
    private final String speciality;

    public Statistics(String nameSurname, String gender, String country, int money, String speciality) {
        this.nameSurname = nameSurname;
        this.gender = gender;
        this.country = country;
        this.money = money;
        this.speciality = speciality;
    }

    public int getMoney() {
        return money;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "nameSurname='" + nameSurname + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", money=" + money +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
