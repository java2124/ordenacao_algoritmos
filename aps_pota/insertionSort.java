
public class insertionSort {
    private int compara;

    public int getCompara() {
        return compara;
    }

    public void insertionSortOrdena(int[] lista) {
        compara = 0;
        int atual;
        for (int i = 1; i < lista.length; i++) {
            atual = lista[i];
            int j = i - 1;
            compara++;
            while ((j >= 0) && (lista[j]) > atual) {
                lista[j + 1] = lista[j]; // copia o valor para a direita da posição atual (j)
                j--;
            }
            lista[j + 1] = atual;
        }
    }

}
