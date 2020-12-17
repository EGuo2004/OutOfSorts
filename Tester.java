import java.util.*;
public class Tester{
  public static void main(String[] args) {
    Random rand = new Random();
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt();
    }
    Sorts.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));

  }
}
