import java.util.LinkedList;

public class bucketSort {
    private int compara;

    public int getCompara() {
        return compara;
    }

    public void bucketSortOrdena(int[] vetor, int maiorValor) {
        compara = 0;
        int numBaldes = maiorValor / 5;

        LinkedList[] B = new LinkedList[numBaldes];

        for (int i = 0; i < numBaldes; i++) {
            B[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < vetor.length; i++) {
            int j = numBaldes - 1;
            while (true) {
                compara++;
                if (j < 0) {
                    break;
                }
                compara++;
                if (vetor[i] >= (j * 5)) {
                    B[j].add(vetor[i]);
                    break;
                }
                j--;
            }
        }

        int indice = 0;
        for (int i = 0; i < numBaldes; i++) {

            int[] aux = new int[B[i].size()];
            for (int j = 0; j < aux.length; j++) {
                aux[j] = (Integer) B[i].get(j);
            }

            insertionSort rafa = new insertionSort();
            rafa.insertionSortOrdena(aux);

            for (int j = 0; j < aux.length; j++, indice++) {
                vetor[indice] = aux[j];
            }

        }
    }
}
