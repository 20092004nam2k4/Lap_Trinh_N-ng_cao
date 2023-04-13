package TaoLopConNguoi;
//tạo lớp con
public class Employee extends People{

  //khai báo thuộc tính enterprise
  private String enterprise;



  //phương thức constructor
  public Employee(){
    this.enterprise = "CodeGym";
  }

  public Employee(String enterprise){
    this.enterprise = enterprise;
  }

  public Employee(String name, boolean gender, int age, String enterprise){
    super(name, gender, age );
    this.enterprise = enterprise;
  }



  //getter và setter
  public String getEnterprise(){
    return enterprise;
  }

  public void  setEnterprise(String enterprise){
    this.enterprise = enterprise;
  }


  //Có phương thức work thể hiện hành động làm việc
  public void work(){
    System.out.println ("viết code");
  }


  //Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu
  @Override
  public String toString(){
    return "A employee work at: " + getEnterprise ()
      +" which is a subclass of: "+ super.toString ();
  }

}
