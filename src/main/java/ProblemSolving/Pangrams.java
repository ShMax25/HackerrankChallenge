package ProblemSolving;

import java.util.HashMap;

public class Pangrams {
  public static void main (String[] args) {
    System.out.println(solution("We promptly judged antique ivory buckles for the next prize"));
  }

  public static String solution (String phrase) {
    HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();

    for (Character c : phrase.toCharArray()) {
      if (Character.toLowerCase(c) >= 97 && Character.toLowerCase(c) <=122 ) {
        if (!alphabet.containsKey(Character.toLowerCase(c))) {
          alphabet.put(Character.toLowerCase(c), 1);
        }
      }
    }
    if (alphabet.size() == 26) {
      return "pangram";
    }
    return "not pangram";
  }
}
