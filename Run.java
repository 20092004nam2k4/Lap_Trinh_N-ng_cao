package TaoLopDongVat;

public class Run {
  public static void main(String[] args) {
    Animal animal = new Animal ();
    System.out.println (animal);

    animal = new Animal(1.0,2.0);
    System.out.println (animal);

    Cat cat = new Cat ();
    System.out.println (cat);
    cat = new Cat (1.0,2.0,3.0);
    System.out.println (cat);
  }
}
