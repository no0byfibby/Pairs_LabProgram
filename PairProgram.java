import java.util.Scanner;

public class PairProgram {
   public static Pair<Integer> readIntegerPair(Scanner scnr) {
    Integer a = scnr.nextInt();
    Integer b = scnr.nextInt();
    Pair <Integer> integerPair = new Pair<Integer>(a, b);
    return integerPair;
   }

   public static Pair<Double> readDoublePair(Scanner scnr) {
    Double a = scnr.nextDouble();
    Double b = scnr.nextDouble();
    Pair <Double> doublePair = new Pair<Double>(a, b);
    return doublePair;
    }

   public static Pair<String> readWordPair(Scanner scnr) {
    String a = scnr.next();
    String b = scnr.next();
    Pair <String> stringPair = new Pair<String>(a, b);
    return stringPair;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pair<Integer> integerPair1 = readIntegerPair(scnr);
      Pair<Integer> integerPair2 = readIntegerPair(scnr);

      Pair<Double> doublePair1 = readDoublePair(scnr);
      Pair<Double> doublePair2 = readDoublePair(scnr);

      Pair<String> wordPair1 = readWordPair(scnr);
      Pair<String> wordPair2 = readWordPair(scnr);

    System.out.println(integerPair1.toString()+" "+integerPair1.comparisonSymbol(integerPair2)+" "+integerPair2.toString());
    System.out.println(doublePair1.toString()+" "+doublePair1.comparisonSymbol(doublePair2)+" "+doublePair2.toString());
    System.out.println(wordPair1.toString()+" "+wordPair1.comparisonSymbol(wordPair2)+" "+wordPair2.toString());
   }
}
