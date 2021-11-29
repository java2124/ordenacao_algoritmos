import java.util.ArrayList;

public class Estudo {
    public static void main(String[] args) {
        ArrayList<int[]> vetores = new ArrayList<>();

        
          for (int j = 0; j < 50; j++) {
          int[] vetor = new int[50000];
          
         
          for (int i = 0; i < 50000; i++) {
          vetor[i] = (int) (Math.random() * 50000);
          }
          
          vetores.add(vetor);
          }
         

        /* // Buble
        bubbleSort bubble = new bubbleSort();
        int total = 0;
        for (int i = 0; i < 50; i++) {
            int[] vetor = vetores.get(i);
            bubble.bubbleSortOrdena(vetor);
            int compara = bubble.getCompara();
            total += compara;
        }
        float totalFinish = total / 50;
        System.out.println("bubble " + totalFinish);

        // Selection
        selectionSort selection = new selectionSort();
        total = 0;
        for (int i = 0; i < 50; i++) {
            int[] vetor = vetores.get(i);
            selection.selectionSortOrdena(vetor);
            int compara = selection.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("selection " + totalFinish); */

        // Insertion
        insertionSort insertion = new insertionSort();
        int total = 0;
        int totalFinish;
        for (int i = 0; i < 50; i++) {
            int[] vetor = vetores.get(i);
            insertion.insertionSortOrdena(vetor);
            int compara = insertion.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("insertion " + totalFinish);

        // HeapSort
        total = 0;
        for (int i = 0; i < 50; i++) {
            heapSort heap = new heapSort(50000);
            int[] vetor = vetores.get(i);
            for (int j = 0; j < 50000; j++) {
                heap.insert(new No(vetor[j]));
            }
            heap.heapSortOrdena();
            int compara = heap.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("heap " + totalFinish);

        // Merge
        mergeSort merge = new mergeSort();
        total = 0;
        for (int i = 0; i < 50; i++) {
            int[] vetor = vetores.get(i);
            merge.mergeSortOrdena(vetor);
            int compara = merge.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("merge " + totalFinish);

        // Quick
        quickSort quick = new quickSort();
        total = 0;
        for (int i = 0; i < 50; i++) {
            quick.comparaZera();
            int[] vetor = vetores.get(i);
            quick.quickSortOrdena(vetor, 0, vetor.length - 1);
            int compara = quick.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("quick " + totalFinish);

        // Count
        countSort count = new countSort();
        total = 0;
        for (int i = 0; i < 50; i++) {
            int[] vetor = vetores.get(i);
            count.countSortOrdena(vetor);
            int compara = count.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("count " + totalFinish);

        // Bucket
        bucketSort bucket = new bucketSort();
        total = 0;
        for (int i = 0; i < 50; i++) {
            int max = 0;
            for (int j = 0; j < vetores.get(i).length - 1; j++) {
                if (vetores.get(i)[j] > max) {
                    max = vetores.get(i)[j];
                }
            }
            int[] vetor = vetores.get(i);
            bucket.bucketSortOrdena(vetor, max);
            int compara = bucket.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("bucket " + totalFinish);

        // RadixSort
        radixSort radix = new radixSort();
        total = 0;
        for (int i = 0; i < 50; i++) {
            int[] vetor = vetores.get(i);
            radix.radixSortOrdena(vetor);
            int compara = radix.getCompara();
            total += compara;
        }
        totalFinish = total / 50;
        System.out.println("radix " + totalFinish);

    }
}
