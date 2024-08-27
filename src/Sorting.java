public class Sorting {
    
    public Sorting() {

    }

    //Worse: O(n^2), Average: O(n^2), Best: O(n), Space: O(1)
    //Best here is O(n^2) because it's not checking swaps
    public void bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length - i; j++) {
                if(array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    //Worse: O(n^2), Average: O(n^2), Best: O(n^2), Space: O(1)
    public void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //Worse: O(n^2), Average: O(n^2), Best: O(n), Space: O(1)
    public void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    //Worse: O(n^2), Average: O(nlogn), Best: O(nlogn), Space: O(logn) or O(n) if pivot creates unbalanced partitions
    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public void print(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
    }
}
