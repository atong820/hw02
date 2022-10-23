class CWin // 定義類別 CWin
 {
 private String color;
 private int width;
 private int height;
 private static int cnt=0;

 public CWin(String str,int w,int h) // CWin() 建構元
 {
 color=str;
 width=w;
 height=h;
 count();
 }
 public CWin() // CWin() 建構元
 {
this("Red",2,2);
 }
 public static void count()
 {
 cnt++;
 }
 public static void setZero()
 {


 cnt=0;
 }
 public static void setValue(int n)
 {
 cnt=n;
 }
 public static void show()
 {
 System.out.println("cnt="+cnt);
 }
 }

public class hw9_8
 {
 public static void main(String args[])
 {
 CWin w1=new CWin();
 CWin w2=new CWin("Blue",5,8);
 CWin.show();

 CWin.setZero();
 System.out.println("using setZero()...");
 CWin.show();

 CWin.setValue(10);
 System.out.println("using setValue(10)...");
 CWin.show();

 CWin w3=new CWin("Green",4,6);
 CWin.show();
 }
 }
