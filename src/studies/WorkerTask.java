package studies;

import data.Worker;
import data.CatRecordClass;

public class WorkerTask {
    public static void main(String[] args) {

        //statini metoda iskviesime is kitos klases, tam nereikia kurti tos klases objekto
        //parasome kitos klases pavadinima, taskas, metoda


        //cat record test
        CatRecordClass catRecordClass = new CatRecordClass("Pukis", "Persas");
        System.out.println("CatRecordClass test");
        System.out.println(catRecordClass.name());
        System.out.println(catRecordClass.kind());
        System.out.println("--------------------");


        //kuriame nauja objekta darbuotojas nenurodant parametru
        System.out.println("Kuriamas objetas nenurodzius parametru");
        Worker workerDummy = new Worker();
        System.out.println(workerDummy);

        //kuriame nauja objekta darbuotojas nurodant parametrus
        System.out.println("Kuriamas objetas nurodzius parametrus");
        Worker worker = new Worker(499.0, 80.0);
        System.out.println(worker);

        //pasiimam info
        System.out.println("worker.GetInfo");
        worker.getInfo();

        //pasiimam info
        System.out.println("workerDummy.getInfo");
        workerDummy.getInfo();

        //pridedam 10 eur jei nevirsija 500
        System.out.println("worker.IncreasePayment");
        worker.increasePayment();
        worker.getInfo();
        System.out.println("workerDummy.IncreasePayment");
        workerDummy.increasePayment();
        workerDummy.getInfo();


        //pridedam 5 eur ir nurodyta valandu kieki
        System.out.println("worker.IncreaseHours");
        worker.increaseHours(20.0);
        worker.getInfo();
        System.out.println("workerDummy.IncreaseHours");
        workerDummy.increaseHours(10);
        workerDummy.getInfo();
    }
}
