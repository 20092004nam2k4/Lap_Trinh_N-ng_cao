package Shape;
import HeCacDoiTuongHinhHoc.Shape;
public  class Rectangle extends Shape {
  private double width = 1.0;
  private double length = 1.0;

  public Rectangle (){
  this.width = width;
  this.length = length;
  }

  public Rectangle (double width, double length){
    this.width = width;
    this.length = length;
  }

  public Rectangle(String color, boolean filled, double width, double length){
    super(color,filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }

  public double getLength(){
    return length;
  }
  public void setLength(double length){
    this.length = length;
  }


public double getArea (){
    return  width * length;
}

public double getPerimeter(){
    return 2*(width+length);
}




@Override
  public String toString(){
    return "chiều rộng của hình chữ nhật là: " + width +"  chiều dài của hình chữ nhật là: "+ length
      + "   chu vi: "+ getPerimeter ()
      + "   diện tích: " + getArea () + "   " +super.toString ();
}

}
