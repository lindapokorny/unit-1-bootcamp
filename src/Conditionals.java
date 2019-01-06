
public class Conditionals {

  public static void main(String args[]) {

  }

  public static boolean isOdd(int n) {
    if ((n % 2) != 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isMultipleOfThree(int n) {
    if ((n % 3) == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isOddAndIsMultipleOfThree(int n) {
    if (((n % 2) == 0) && ((n % 3) == 0)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isOddAndIsMultipleOfThree2(boolean isMultipleOfThree, boolean isOdd){
    if ((isMultipleOfThree && isOdd) == true){
      return true;
    }
    else {
      return false;
    }
  }
  public static void fizzMultipleofThree(int n){
    if ((n%3) == 0){
      System.out.println("Fizz");
    }else{
      System.out.println(n);
    }

  }
}
