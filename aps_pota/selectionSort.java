public class selectionSort {
    private int compara;

    public int getCompara() {
        return compara;
    }

    public void selectionSortOrdena(int[] lista) {
        compara = 0;
        int indiceMenor;
        for (int indiceAtual = 0; indiceAtual < lista.length; indiceAtual++) {
            indiceMenor = indiceAtual;
            for (int indiceCompara = indiceAtual + 1; indiceCompara < lista.length; indiceCompara++) {
                compara++;
                if (lista[indiceCompara] < lista[indiceMenor]) {
                    indiceMenor = indiceCompara;
                }
            }
            swap(lista, indiceMenor, indiceAtual);
        }
    }

    private static void swap(int[] lista, int indiceMenor, int indiceAtual) {
        int aux = lista[indiceAtual];
        lista[indiceAtual] = lista[indiceMenor];
        lista[indiceMenor] = aux;
    }

}
