package Shape;

import HeCacDoiTuongHinhHoc.Shape;

public class chaythu {
  public static void main(String[] args) {
    //phần Shape================================

    Shape shape = new Shape ();
    System.out.println (shape);

    shape = new Shape ("red",false);
    System.out.println (shape );

    System.out.println ();
    System.out.println ();







    //phần Circle================================
    Circle circle = new Circle ();
    System.out.println (circle );

    circle = new Circle (3.5);
    System.out.println (circle );

    circle = new Circle ("indigo",false,3.5);
    System.out.println (circle);
    System.out.println ();
    System.out.println ();


    Rectangle rectangle = new Rectangle ();
    System.out.println (rectangle);

    rectangle = new Rectangle ("màu cam", true, 3.5, 3.5);
    System.out.println (rectangle);
    System.out.println ();
    System.out.println ();



    //Square====================================================

    Square square = new Square();
    System.out.println(square);

    square = new Square( );
    System.out.println(square);

    square = new Square( );
    System.out.println(square);
  }
}
