package inheritance.polimorphism.secondTaskThree;

public class Program {
    public static void main(String[] args) {
        Storage dataBase = new DataBase();
        Storage remoteDisk = new RemoteDisk();
        Info info1 = new Info(1, "Labas");
        Info info2 = new Info(2, "Krabas");
        dataBase.saveinfo(info1);
        dataBase.saveinfo(info2);
        remoteDisk.saveinfo(info1);
        remoteDisk.saveinfo(info2);

        Program program = new Program();

        program.findById(remoteDisk, 1);
        program.findByWord(remoteDisk, "Krabas");

        program.findById(dataBase, 1);
        program.findByWord(dataBase, "Krabas");

    }

    void save(Storage storage, Info info) {
        storage.saveinfo(info);
    }

    void findById(Storage storage, Integer id) {
        System.out.println(storage.findInfo(id));
    }

    void findByWord(Storage storage, String word) {
        System.out.println(storage.findInfo(word));
    }
}
