public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int x;
    int swaps = 1;
    for (int i = data.length; i > 0 && swaps > 0;i--) {
        swaps = 0;
      for (int j = 1; j < i; j++) {
        if (data[j] < data[j-1]) {
          x = data[j];
          data[j] = data[j-1] ;
          data[j-1] = x;
          swaps++;
        }
      }
    }
  }

  public static void selectionSort(int[] data) {
    int x;
    int min_val;
    int indexOf;
    for (int i = 0; i < data.length - 1; i++) {
      min_val = data[i];
      indexOf = i;
      for(int j = i + 1; j < data.length; j++) {
        if(data[j] < min_val) {
          min_val = data[j];
          indexOf = j;
        }
      }
      x = data[i];
      data[i] = data[indexOf];
      data[indexOf] = x;
    }
  }

  public static void insertionSort (int[] data) {
    int x;
    for (int i = 1; i < data.length; i++) {
      x = data[i];
      int j;
      for(j = i - 1 ; j >= 0 && x < data[j]; j--) {
          data[j+1] = data[j];
      }
      data[j+1] = x;
    }
  }

}
