package Preparation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MiniMax {

    /*
     * Complete the 'miniMaxSum' function below.
     *  Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four
     *  of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        System.out.println((sum - arr.get(4)) + " " + (sum - arr.get(0)));
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMax.miniMaxSum(arr);

        bufferedReader.close();
    }
}