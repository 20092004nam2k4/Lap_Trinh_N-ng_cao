package Shape;

import HeCacDoiTuongHinhHoc.Shape;

//tạo lớp con Circle thừa hưởng Shape của lớp cha
public class Circle extends Shape {

 //1 thuộc tính đề cho
  double radius;


  // phương thức không tham số
  public Circle (){
    this.radius = radius;
  }


  //phương thức 1 tham số
  public Circle(double radius){
    this.radius = radius;
  }


  //phương thức tất cả các tham số
  public Circle(String color, boolean filled, double radius){
    super(color,filled);
    this.radius = radius;
  }


  //getter and setter

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }


  // tạo một phương thức tính diện tích
  public double getAcreage(){
    return radius*radius*Math.PI;
  }


  //tạo một phương thức tính chu vi
  public double getPerimeter(){
    return 2*radius*Math.PI;
  }

  // Được cài đè phương thức toString trả về chuỗi ký tự
  @Override
  public String toString() {
    return "A Circle with radius{" +
      "radius=" + getRadius ()+
      "} " +"which is a subclass of"+ super.toString ( );
  }
}



