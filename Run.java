package TaoLopDienThoai;

public class Run {
  public static void main(String[] args) {
    Nokia nokia = new Nokia ();
    System.out.println (nokia);
    nokia.downloadApp ();

    Iphone iphone = new Iphone ();
    System.out.println (iphone);
    iphone.downloadApp ();
  }
}
