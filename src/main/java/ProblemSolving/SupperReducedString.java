package ProblemSolving;

public class SupperReducedString {

  public static void main (String[] args) {
    System.out.println(solution("baab"));
  }

  public static String solution (String word) {
    for (int i = 1; i < word.length(); i++) {
      if (word.charAt(i) == word.charAt(i - 1)) {
        word = word.substring(0, i - 1) + word.substring(i + 1);
        i = 0;
      }
    }
    if (word.length() != 0) {
      return word;
    }
    return "Empty String";
  }
}
