package TaoLopConNguoi;

public class People {
  //thuộc tính
  private String name;
  private boolean gender;
  private int age;


  //phương thức constructor
  public People(){
    this.name = "tên mặc đinh";
    this.gender = false;
    this.age = 0;
  }

  public  People(String name, boolean gender, int age){
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  //getter and setter

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  public boolean isGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
   this.age = age;
  }

  //Có phương thức eat, sleep thể hiện các hành động ăn, ngủ
  public void getEat(){
    System.out.println ("ăn táo");
  }

  public void sleep() {
    System.out.println ("ngủ nướng" );
  }


  //Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu//
  @Override
  public String toString(){
    return "Một người có tên: "+ getName ()
      +"  age: "+ getAge ()+"  and gender: "+ (isGender ()?"nam":"nu")+"   " +
      "      " + super.toString ();
  }
}
