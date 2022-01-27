package Preparation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CountingSort1 {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> frequency = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            frequency.add(i,0);
        }

        for (Integer i : arr) {
            frequency.add(i, frequency.get(i) + 1);
        }
       return frequency;
    }

}

 class CountingSort1Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = CountingSort1.countingSort(arr);



        bufferedReader.close();
    }
}
