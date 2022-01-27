package Preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int level = 0;
        boolean isValley = false;


        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D' && level == 0) {
                isValley = true;
            }


            if (path.charAt(i) == 'U') level += 1;
            if (path.charAt(i) == 'D') level -= 1;

            if (level == 0 && isValley == true) {
                valleys += 1;
                isValley = false;
            }





        }

        return valleys;
    }

}

class countingValleysSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleys.countingValleys(steps, path);
        System.out.println(result);


        bufferedReader.close();

    }
}

