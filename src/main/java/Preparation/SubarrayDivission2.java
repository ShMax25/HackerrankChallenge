package Preparation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // first solution
//        int n = 0;
//        if (s.size() == 1 && s.get(0) == d) {
//            n = 1;
//        } else {
//
//            for (int i = 0; i <= s.size() - m; i++) {
//                int sum = 0;
//                for (int k = i; k < i + m; k++) {
//                    sum += s.get(k);
//                }
//                if (d == sum) {
//                    n++;
//                }
//            }
//        }
//        return n;

        // second solution
        int n = 0;
        if (s.size() == 1 && s.get(0) == d) {
            n = 1;
        } else {
            for(int i = 0; i <= s.size() - m; i++) {
                int sum = 0;
                List<Integer> sub = s.subList(i, i + m);
                for (int p = 0; p < m; p++) {
                    sum += sub.get(p);
                }
                if(sum == d) {
                    n ++;
                }
            }
        }
        return n;
    }

}

class SubarrayDivissionSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);
        System.out.println(result);



        bufferedReader.close();

    }
}

