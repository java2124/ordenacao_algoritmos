public class countSort {

    private int compara;

    public int getCompara() {
        return compara;
    }

    public void countSortOrdena(int[] arr) {
        compara = 0;
        int arrayLength = arr.length;
        if (arrayLength == 0)
            return;

        int max = arr[0], min = arr[0];
        for (int i = 1; i < arrayLength; i++) {
            compara++;
            if (arr[i] > max)
                max = arr[i];
            compara++;
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;

        int[] count = new int[range];

        for (int i = 0; i < arrayLength; i++)
            count[arr[i] - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }
}
