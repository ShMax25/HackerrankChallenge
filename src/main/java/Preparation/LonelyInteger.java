package Preparation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class LonelyInteger {

    /*
     * Complete the 'lonelyinteger' function below.
     * Given an array of integers, where all elements but one occur twice, find the unique element.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
    Collections.sort(a);
    int result = 0;
    for (int i = 0; i < a.size() - 1; i+=2) {
        if (!a.get(i).equals(a.get(i + 1))) return a.get(i);
        result^ =
    }
    return a.get(a.size() - 1);
    }

}

class SolutionLonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = LonelyInteger.lonelyinteger(a);
        System.out.println(result);


        bufferedReader.close();

    }
}

