package data;

public class Worker {
    private double payment = 99;
    private double hours = 10;

    //konstruktorius paduodant parametrus
    public Worker(double payment, double hours) {

//        kada rasyti su "this" kada be????
//        su this rasome kai parametro vardas sutampa
//        su klases kintamojo vardu

        this.payment = payment;
        this.hours = hours;
    }

    //konstruktorius be parametru
    public Worker() {
    }

    //atspausdina atlyginima ir valandas
    public void getInfo() {
        System.out.printf("Atlyginimas yra %s, dirbo %s valandu%n", payment, hours);
    }

    //pridedam 10 eur jei nevirsija 500
    public void increasePayment() {
        if (payment < 500) {
            payment += 10;
            //payment = payment + 10;
        }
    }

    //pridedam 5 eur ir nurodyta valandu kieki
    public void increaseHours(double increaseHours) {
        payment = payment + 5;
        hours = hours + increaseHours;
    }

}

