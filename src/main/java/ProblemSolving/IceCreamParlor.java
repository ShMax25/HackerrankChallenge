package ProblemSolving;

import java.util.Arrays;

public class IceCreamParlor {
  public static void main (String[] args) {
    int n = 4;
    int [] prices = {2, 2, 4, 3};

    System.out.println(Arrays.toString(Solution(n, prices)));
  }

  public static int[] Solution(int n, int[] pricesArray) {

    int[] result = new int[2];
    boolean resultFound = false;

    for(int i = 0; i < pricesArray.length - 1; i++) {
      for (int k = i+1; k < pricesArray.length; k++) {
        if (n - pricesArray[i] == pricesArray[k]) {
          result[0] = i + 1;
          result[1] = k + 1;
          resultFound = true;
          break;
        }
      }
      if (resultFound) {
        break;
      }
    }
    return result;
  }
}
