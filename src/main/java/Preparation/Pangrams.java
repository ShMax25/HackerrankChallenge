package Preparation;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


import static java.util.stream.Collectors.joining;

class PangramsResult {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String sentense = s.toLowerCase();

        Map<Integer, Integer> alphabet = new HashMap<Integer ,Integer>();

        for (int i = 97; i < 123; i++) {
            alphabet.put(i, 0);
        }

        for (char c : sentense.toCharArray()) {
            for (Map.Entry<Integer,Integer> entry : alphabet.entrySet()) {
                int key = entry.getKey();
                if (key == c) {
                    alphabet.put(key, entry.getValue() + 1);
                }
            }
        }

        if (alphabet.containsValue(0)) {
            return "not pangram";
        } else {
           return  "pangram";
        }
    }

}

 class PangramsSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();

        String result = PangramsResult.pangrams(s);

        System.out.println(result);


        bufferedReader.close();

    }
}
