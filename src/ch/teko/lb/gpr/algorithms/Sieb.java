package ch.teko.lb.gpr.algorithms;

import java.util.ArrayList;

/**
 * Das Sieb des Eratosthenes ist ein aus der Antike stammender Algorithmus zur Bestimmung der Primzahlen
 * unterhalb einer beliebigen Obergrenze.
 * <p>
 * Mit dem Sieb des Eratosthenes werden alle Primzahlen zwischen 2 und einer oberen Grenze bestimmt.
 * Alle Zahlen zwischen 2 und der Obergrenze werden zunächst als potentielle Primzahlen markiert. Die kleinste potentielle Primzahl (2)
 * muss so sein und ausgegeben werden. Dann alle Vielfachen dieser Zahl bis zur Obergrenze und als Nicht-Primzahl mar-
 * kiert, weil sie als Vielfache nicht Primzahl sein können. Geben Sie im nächsten Schritt die zweite Dezimalzahl (3)
 * aus, die immer noch als Primzahl gekennzeichnet ist, und markieren Sie ihre Vielfachen als Nicht-Primzahl.
 * Geben Sie dann die dritte Dezimalstelle, die noch als Primzahl gekennzeichnet ist (5, da 4 bereits als Vielfaches
 * von 2 als Nicht-Primzahl gekennzeichnet ist), als Vielfaches von 5 aus und so weiter.
 *
 * Das Ergebnis ist die Ausgabe aller Primzahlen zwischen 2 und der angegebenen Obergrenze.
 */
public class Sieb {

    // Konstante für die Obergrenze
    private static final int GRENZE = 1000;
    // Array für alle Primzahlen von 0 - GRENZE
    private static final boolean[] istPrimzahl = new boolean[GRENZE];

    /**
     * Die Methode erstellt ein int-Array, das die zu testenden Zahlen in aufsteigender Reihe speichert, von 2
     * bis zur Obergrenze, die in der GRENZE-Variablen gespeichert ist.
     */
    private static int[] erstelleArray() {
        int[] arr = new int[GRENZE];
        for (int i = 2; i < arr.length; ++i) {
            arr[i - 2] = i;
            // Logische Operation, wenn i = 2 ist, ODER i dividiert durch 2 gleich 1
            // ergibt speichern wir true ab ansonsten false
            istPrimzahl[i - 2] = i == 2 || i % 2 == 1;
        }
        return arr;
    }

    /**
     * Diese Methode liefert den eigentlichen Sieb-Algorithmus. Als Argument wird ein numerisches Array übergeben,
     * welches die zu prüfenden Werte enthält, wie sie von erstelleArray() zurückgegeben werden.
     *
     * Im Body der Methode wird zunächst eine leere ArrayList erstellt, die dann alle Primzahlen enthält.
     * Alle Werte von 2 bis GRENZE laufen in einer Schleife und prüfen auf Einträge in istPrimzahl, die zu ihren je-
     * weiligen Indizes gehören. True, wenn der entsprechende Wert des numerischen Arrays hier mit "primzahlen" mar-
     * kiert ist, dann wird er in die ArrayList eingetragen. In nachfolgenden Schleifen werden Vielfache dieses Werts
     * in istPrimzahl als falsch markiert, um den zugehörigen Wert von der Suche auszuschliessen.
     */
    private static ArrayList<Integer> siebeAus(int[] n) {
        // ArrayList für alle Primzahlen
        ArrayList<Integer> primzahlen = new ArrayList<>();

        for (int i = 2; i < GRENZE; ++i) {
            // Wenn Element n in istPrimzahl true ist dann fügen wir diese der ArrayList hinzu
            if (istPrimzahl[i - 2]) {
                primzahlen.add(n[i - 2]);
                // Alle Vielfachen von n sind automatisch auch keine Primzahlen mehr
                for (int j = i * i; j < GRENZE; j += i) {
                    istPrimzahl[j - 2] = false;
                }
            }

        }
        return primzahlen;
    }

    /**
     * Einfache Iteration über die ArrayList
     */
    private static void gibAus(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.printf("%4d ist eine Primzahl \n", i);
        }
    }

    public static void main(String[] args) {
        gibAus(siebeAus(erstelleArray()));
    }
}
