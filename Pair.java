public class Pair <TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

// Pair constructor that takes two parameters of a custom type "TheType" that's a placeholder for any type that implements the "Comparable" interface (Integer, Double, String, etc.)
public Pair(TheType firstVal, TheType secondVal){
    this.firstVal = firstVal;
    this.secondVal = secondVal;
}
    // Custom "toString" method defined in the Pair class; overrides the "Object" classes toString method
   @Override
   public String toString() {
    return "["+firstVal+", "+secondVal+"]";
   }

   // Implement Comparable's expected compareTo(); without this, the class won't run
   public int compareTo(Pair<TheType> otherPair) {
      int compareOne = this.firstVal.compareTo(otherPair.firstVal); // Compares the firstVal variable of the current "Pair" object ("this") with the other "Pair" object ("otherPair")
      if(compareOne != 0){
         return compareOne;
      } // If the first values are equal, the secondVal of each Pair object is compared
      return this.secondVal.compareTo(otherPair.secondVal);
   }
   // Uses the implemented "compareTo" method to print out <, >, or = depending on how two Pair objects compare to eachother
   public char comparisonSymbol(Pair<TheType> otherPair) {
      int compare = this.compareTo(otherPair);
      if(compare < 0){
         return '<';
      }
      else if(compare > 0){
         return '>';
      }
      else{
         return '=';
      }
   }

}
