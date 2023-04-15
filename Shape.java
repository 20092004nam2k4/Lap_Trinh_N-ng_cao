package Triangle;

public class Shape {

  private String color;

  public Shape() {
    this.color = "red";
  }

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return 0;
  }

  public double getPerimeter() {
    return 0;
  }

  public String toString() {
    return "This shape has color " + color + ".";
  }
}
