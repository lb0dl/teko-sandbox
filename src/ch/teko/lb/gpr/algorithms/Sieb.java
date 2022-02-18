package ch.teko.lb.gpr.algorithms;

/**
 * Das Sieb des Eratosthenes ist ein aus der Antike stammender Algorithmus zur Bestimmung der Primzahlen
 * unterhalb einer beliebigen Obergrenze.
 *
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
public class SiebDesEra {

    // Konstante für die Obergrenze
    private static final int GRENZE = 1000;
    private static boolean[] istPrimzahl = new boolean[GRENZE];

    public static void main(String[] args) {

    }



}
