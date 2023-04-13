package TaoLopDongVat;
//tạo lớp Cat là con của Animal
public class Cat extends  Animal {

  //Có thêm thuộc tính age
  private double age ;

//Có ba phương thức khởi tạo
  public Cat(){
    this.age = 1.0;
  }

  public Cat(double age){
    this.age = age;
  }

  public Cat (double weight, double height, double age){
    super(weight, height );
    this.age = age;
  }


//Có các getter và setter cho tất cả các thuộc tính
  public double getAge(){
    return age;
  }

  public void setAge (double age){
    this.age = age;
  }


  //Có phương thức sound và eat trả về tiếng kêu và thức ăn
  public void sound (){
    System.out.println ("meo meo");
  }

  public void eat(){
    System.out.println ("cá khô");
  }


//Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu
  @Override
public String toString(){
    return "A Cat with age: " + getAge ()
      + ", which is a subclass of: "+super.toString ();
  }
}
