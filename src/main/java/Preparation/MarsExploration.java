package Preparation;

import javax.swing.*;
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

class MarsExplorationResult {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int brokenCharts = 0;

        if(s.length() == 3) {
            for (char c : s.toLowerCase().toCharArray()) {
                if (c != 's' && c != 'o') {
                    brokenCharts++;
                }
            }
        } else {

            for (int i = 3; i <= s.length(); i = i + 3) {
                String signal = s.substring(i - 3, i).toLowerCase();
                char[] arr = signal.toCharArray();
                if (arr[0] != 's') {
                    brokenCharts++;
                }
                if (arr[1] != 'o') {
                    brokenCharts++;
                }
                if (arr[2] != 's') {
                    brokenCharts++;
                }

            }
        }
        return brokenCharts;
    }

}

class MarsExplorationSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();

        int result = MarsExplorationResult.marsExploration(s);


        System.out.println(result);
        bufferedReader.close();

    }
}

