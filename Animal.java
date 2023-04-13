package TaoLopDongVat;

//tạo lớp animal
public class Animal {

  //thuộc tính của animal
  private double weight;
  private double height;
//Có hai phương thức khởi tạo
  public Animal(){
    this.weight = 0.0;
    this.height = 0.0;
  }

  public Animal(double weight, double height){
    this.weight = weight;
    this.height = height;
  }


  //Có các getter và setter cho tất cả các thuộc tính=======================================
  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

//Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu
  @Override
  public String toString(){
    return "A Animal with weight: " + getWeight ()
      + "   and height: " + getHeight () +", which is a subclass of:"+ super.toString ();
  }
}
