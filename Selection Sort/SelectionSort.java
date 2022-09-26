public class SelectionSort 
{
    public static void selectionSort(int array[]) {
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) 
                    swap(array, i, j);
            }
        }
    }
    
    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        int array[] = {27, 34, 30, 12, 82, 40, 55, 4};
        
        selectionSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}