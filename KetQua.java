package TaoLopConNguoi;

import java.util.Arrays;

public class KetQua {
  public static void main(String[] args) {
    System.out.println ();
    System.out.println ();
    System.out.println ("people ");
    People people = new People ();
    System.out.println (people);
    people = new People ("nam",true,18);
    System.out.println (people);
    System.out.println ();
    System.out.println ();


    System.out.println ("student");
    Student student = new Student ();
    System.out.println (student);
    student = new Student ("NAM",true,18,"IBSK1D101 NAM");
    System.out.println (student);
    System.out.println ();
    System.out.println ();


    System.out.println ("Employee");
    Employee employee = new Employee ();
    System.out.println (employee);
    employee = new Employee ("nam", true, 18 , "khoa viễn tưởng");
    System.out.println (employee);

  }
}
