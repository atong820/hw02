class Caaa
 {
 public int num1;
 public int num2;

 public Caaa(int a,int b)
 {
 num1=a;
 num2=b;
}
 }

 class Cbbb extends Caaa
 {
 public Cbbb(int a,int b)
 {
 super(a,b);
 }
 public void show()
 {


 System.out.println("num1="+num1+", num2="+num2);
 }
 }

 public class hw10_14
 {
 public static void main(String args[])
 {
 Cbbb b2=new Cbbb(3,9);
 b2.show();
 }
 }
