package Preparation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int c = size;
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int r = 0; r < size; r++) {
            c -= 1;
            leftDiagonal += arr.get(r).get(r);
            rightDiagonal += arr.get(r).get(c);

        }



        return leftDiagonal < rightDiagonal ? rightDiagonal - leftDiagonal : leftDiagonal - rightDiagonal;
    }

}

 class DiagonalDifferenceSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalDifference.diagonalDifference(arr);
        System.out.println(result);


        bufferedReader.close();
    }
}

