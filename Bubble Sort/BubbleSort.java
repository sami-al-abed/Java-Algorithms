public class BubbleSort 
{
    public static void bubbleSort(int array[]) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean wasChanged = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    wasChanged = true;
                    swap(array, j, j + 1);
                }
            }
            if (!wasChanged) return;
        }
    }
    
    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        int array[] = {27, 3, 30, 12, 82, 40, 55, 4};
        
        bubbleSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}