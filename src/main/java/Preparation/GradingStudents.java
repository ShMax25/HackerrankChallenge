package Preparation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GradigStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for(int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                if ((grades.get(i) + 2) % 5 == 0) {
                    grades.set(i, grades.get(i) + 2);
                } else if ((grades.get(i) + 1) % 5 == 0) {
                    grades.set(i, grades.get(i) + 1);
                }
            }
        }

        return grades;
    }

}

 class GradigStudentsSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = GradigStudents.gradingStudents(grades);

        bufferedReader.close();

    }
}

