package ch.teko.lb.gpr.algorithms;

/**
 * Ein Array wird von vorne nach hinten durchlaufen. Hierbei wird geprüft, ob das jeweilige
 * Element kleiner als sein Nachfolgeelement ist. Ist dies der Fall wird die Schleife fortgesetzt.
 * Falls nicht, so werden das aktuelle Element und sein Nachfolger getauscht, sodass das kleinere
 * Element nun vor dem größeren liegt. Durch rekursiven Aufruf der Methode wird der Schleifendurchlauf
 * erneut gestartet bis eine aufsteigende Sortierung vorliegt.
 */
public class BubbleSort implements ISortable {

    // Zu sortierendes Array
    int[] zuSortieren = {98, 82, 32, 564, 45, 245, 29, 312, 76, 3342, 23, 86, 12, 3, 934580};

    @Override
    public int[] sortiere() {
        int k;
        for (int i = 0; i < zuSortieren.length - 1; i++) {
            // wenn Element an Position i kleiner ist als das nächste, fahren wir weiter
            if (zuSortieren[i] < zuSortieren[i + 1]) {
                continue;
            }
            // wenn Element an Position i grösse ist als das nächste, tauschen wir die Elemente
            k = zuSortieren[i];
            zuSortieren[i] = zuSortieren[i + 1];
            zuSortieren[i + 1] = k;
            // rekursiver Aufruf, bis das grösste Element an letzter Stelle im Array ist
            sortiere();
        }
        return zuSortieren;
    }

    public static void main(String[] args) {

        BubbleSort sorter = new BubbleSort();
        int[] sortiertesArray = sorter.sortiere();

        // Iteration über das sortierte Array
        for (int i = 0; i < sortiertesArray.length; i++) {
            System.out.printf("Position %-3d: %8d\n", i, sortiertesArray[i]);
        }
    }
}
