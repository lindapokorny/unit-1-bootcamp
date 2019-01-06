
public class DataStructures {

  public static void main (String args[]) {

    List<Cat> catArray = new ArrayList<Cat>(5);
    catArray.add("Siamese");
    catArray.add("Russian Blue");
    catArray.add("Persion");
    catArray.add("Sphynx");
    catArray.add("Scottish Fold");

    for(int i=0; i <= 5; i++){
      if (i <= 5){
        System.out.println(i);
      }
      else{
        System.out.println("");
      }
    }

  }
}
