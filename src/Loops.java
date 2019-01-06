
public class Loops {

  public static void main (String args[]) {

    public static void upToTen(){
      for (int i = 1; i <= 10; i++){
      }
      System.out.println(i);
    }
    public static void upToTen2(){
      int i = 1;
      while (int i <= 10){
        System.out.println(i);
      }
    }
    public static void counting(int n){
    for (int i=0; i <= n; i++){
    }
      System.out.println(i);
  }
  public static void counting2(int n){
      for (int i=0; i <= n; i++){
        if (i % 2 == 0){
          System.out.println(i);
        }
        else {
          System.out.println("");
        }
      }
    }
}
