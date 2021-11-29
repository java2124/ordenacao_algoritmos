public class quickSort {
    private int compara = 0;

    public int getCompara() {
        return compara;
    }

    private static void troca(int[] v, int indice1, int indice2) {
        int temp = v[indice1];
        v[indice1] = v[indice2];
        v[indice2] = temp;
    }

    public void comparaZera(){
        compara = 0;
    }

    public void quickSortOrdena(int[] v, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = v[(esq + dir) / 2];

        while (esq <= dir) {
            compara++;
            while (v[esq] < pivo) {
                esq++;
            }
            compara++;
            while (v[dir] > pivo) {
                dir--;
            }
            if (esq <= dir) {
                troca(v, esq, dir);
                esq++;
                dir--;
            }
        }
        if (dir - lo > 0)
            quickSortOrdena(v, lo, dir);

        if (hi - esq > 0)
            quickSortOrdena(v, esq, hi);
    }

}
