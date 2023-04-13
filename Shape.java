package HeCacDoiTuongHinhHoc;

public class Shape {

  //hai thuộc tính
  private String color = "green";
  private boolean filled = true;




  //không tham số
  public Shape() {
    this.color = color;
    this.filled = true;
  }



//hai tham số
  public Shape(String color , boolean filled) {
    this.color = color;
    this.filled = filled;
  }



  //getter and setter
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }



//  toString trả về một chuỗi mô tả đầy đủ trạng thái của đối tượng đang xét.
//  Khi đối tượng được sử dụng trong việc in ra thông tin, nó sẽ tự động gọi phương thức `toString()`
//  để lấy chuỗi biểu diễn cho đối tượng đó.
  @Override
  public String toString() {
    return "The shape of the superclass{" +
      "color='" + color + '\'' +
      ", filled=" + filled +
      '}';
  }
}


