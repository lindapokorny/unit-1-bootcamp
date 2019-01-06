
public class ClassesAndObjects {

  public static void main (String args[]) {

    Cat garfield = new Cat();
    garfield.setFavoriteFood("Lasagna");
    garfield.setAge(20);


    Cat pinkPanther = new Cat();
    pinkPanther.setFavoriteFood("Cheetos");
    pinkPanther.setAge(21);

    Cat catwoman = new Cat();
    catwoman.setFavoriteFood("Pizza");
    catwoman.setAge(40);

  }
  public static boolean isOlder(cat1, cat2) {
    if cat1.getAge() > cat2.getAge() {
      return true;
    }
    else{

      return false;
    }

    public static void makeBestFriends (cat1, cat2){
      cat2.setFavorite(cat1.getFavoriteFood)
      System.out.println(cat.getFood());
    }

    public static String makeKitten (String cat1, String cat2){
      cat1 = cat1.getName();
      cat2 = cat2.getName();
      Cat newKitten = new Cat();
      newKitten.setName(cat1 + cat2);
      newKitten.setAge(0);
      return newKitten;
    }

    public static void adoption (cat, person){
      Person person = new Person();
      person.setOwner(cat);
    }

  }