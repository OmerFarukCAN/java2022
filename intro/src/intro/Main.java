package intro;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java!");

        // camelCase
        String ortaMetin = "Declared String";
        String altMetin = "Declared String 2";

        System.out.println(ortaMetin);

        int vade = 12;
        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            dolarDustuMu = true;
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            dolarDustuMu = false;
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            dolarDustuMu = false;
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        System.out.println("Dolar dustu mu: " + dolarDustuMu + " Ok yonu: " + okYonu);

        String[] krediler = {"Kredi 1", "Kredi 2", "Kredi 3"};

        System.out.println(krediler[1]);

        System.out.println("------------");

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        System.out.println("------------");

        for (var kredi : krediler) {
            System.out.println(kredi);
        }
    }
}