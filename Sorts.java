public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp;
    int swaps = 1;
    for (int i = data.length; i > 0 && swaps > 0;i--) {
        swaps = 0;
      for (int j = 1; j < i; j++) {
        if (data[j] < data[j-1]) {
          temp = data[j];
          data[j] = data[j-1] ;
          data[j-1] = temp;
          swaps++;
        }
      }
    }
  }

  public static void selectionSort(int[] data) {
    int temp;
    int min_val;
    int indexOf;
    for (int i = 0; i < data.length - 1; i++) {
      min_val = data[i];
      for(int j = i + 1; j < data.length; j++) {
        if(data[j] < min_val) {
          min_val = data[j];
          indexOf = j;
        }
      }
      temp = data[i];
      data[i] = data[min_val];
      data[j] = temp;
    }
  }


}
