public class bubbleSort {
    private int compara;

    public int getCompara() {
        return compara;
    }

    public void bubbleSortOrdena(int[] v) {
        int iteracao, i;

        compara = 0;
        for (iteracao = 0; (iteracao < v.length - 1); iteracao++) {
            for (i = 0; i < v.length - 1 - iteracao; i++) {
                compara++;
                if (v[i] > v[i + 1]) {
                    swap(v, i, i + 1);
                }
            }
        }
    }

    private void swap(int[] v, int i, int j) {
        int aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

}
