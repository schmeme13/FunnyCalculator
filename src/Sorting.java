public class Sorting {
    
    public Sorting() {

    }

    //Worse: O(n^2), Average: O(n^2), Best: O(n), Space: O(1)
    //Best here is O(n^2) because it's not checking swaps
    public void bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length - i; j++) {
                if(array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    //Worse: O(n^2), Average: O(n^2), Best: O(n^2), Space: O(1)
    public void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    swap(array, i, j);
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
        if(low >= high) {
            return;
        }

        int pivot = array[high];
        int left = low;
        int right = high;

        while(left < right) {
            while(array[left] <= pivot && left < right) {
                left++;
            }
            while(array[right] >= pivot && left < right) {
                right--;
            }

            swap(array, left, right);
        }

        swap(array, left, high);

        quickSort(array, low, left - 1);
        quickSort(array, left + 1, high);
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void print(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
    }
}
