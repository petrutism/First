package exeptions.planetask;

import java.util.Random;

public class Airplane {
    Random random;

    public Airplane() {
        random = new Random();
    }

    void expandChassis() {
        int randNumb = random.nextInt(11);

        try {
            int rezult = 10 / randNumb;
            if (rezult == 5) {
                chassis();
            }

            System.out.println("OK, vaziuokle sekmingai isskleista...");

        } catch (ArithmeticException ae) {
            System.out.println("ERRROR: vaziuokles isskleisti nepavyko...");
        } catch (ImportantExeption im) {
            System.out.println("ERRROR: " + im.getReason() + "SVARBUMAS: Svarbu...");
        } catch (TemporaryExeption tmp) {
            System.out.println("ERRROR: " + tmp.getReason() + "SVARBUMAS: Laikinas...");
        } catch (ExpandChassisExeption sioob) {
            System.out.println("ERRROR: " + sioob.getReason() + "SVARBUMAS: Nezinomas...");
        } finally {
            System.out.println("INFO: Lektuvas skrenda...");
        }

    }

    private void chassis() throws ExpandChassisExeption {
        int randNumb = random.nextInt(11);
        switch (randNumb) {
            case 0 -> throw new ExpandChassisExeption("Neatsidaro durys");
            case 1 -> throw new ImportantExeption("Exeption1");
            case 2 -> throw new TemporaryExeption("Exeption2");
            case 3 -> throw new ImportantExeption("Exeption3");
            case 4 -> throw new ExpandChassisExeption("Exeption4");
            case 11 -> throw new TemporaryExeption("Exeption5");
            case 12 -> throw new ExpandChassisExeption("Exeption6");
            case 13 -> throw new ImportantExeption("Exeption7");
            case 14 -> throw new ExpandChassisExeption("Exeption8");
            case 15 -> throw new TemporaryExeption("Exeption9");
            case 16 -> throw new ExpandChassisExeption("Exeption10");

        }
    }
}
