package Triangle;

import java.util.Scanner;

public class Run5 {
  public static void main(String[] args) {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter the length of side 1: " );
    double side1 = input.nextDouble ( );
    System.out.print ( "Enter the length of side 2: " );
    double side2 = input.nextDouble ( );
    System.out.print ( "Enter the length of side 3: " );
    double side3 = input.nextDouble ( );
    System.out.print ( "Enter the color of the triangle: " );
    String color = input.next ( );

    Triangle triangle = new Triangle ( side1 , side2 , side3 , color );
    System.out.println ( "The triangle has color " + triangle.getColor ( ) + "." );
    System.out.println ( "The triangle's area is " + triangle.getArea ( ) + "." );
    System.out.println ( "The triangle's perimeter is " + triangle.getPerimeter ( ) + "." );
    input.close ( );
  }
}
