package TaoLopConNguoi;

//tạo lớp con Student
public class Student extends People {
  //thuộc tính
  private String classname;


  // phương thức constructor
  public Student() {
    this.classname = "D101_C1K14";
  }

  public Student(String classname) {
    this.classname = classname;
  }


  public Student(String name , boolean gender , int age , String classname) {
    super ( name , gender , age );
    this.classname = classname;
  }


  //getter và setter
  public String getClassname() {
    return classname;
  }

  public void setClassname(String classname) {
    this.classname = classname;
  }


  //Có phương thức study thể hiện hành động học tập
  public void Study() {
    System.out.println ( "viết bài" );
  }


  //Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu

  @Override
  public String toString() {
    return "A student with class name: " + getClassname()
      + "   which is a subclass of:  " + super.toString ( );
  }
}
