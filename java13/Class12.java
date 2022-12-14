public class hw13_12
 {
 public static void main(String args[])
 {
 int a=3;
 int b=3;
 int c=3;

 if((a+b)<c || (a+c)<b || (b+c)<a)
 System.out.println("不構成三角形");
 else if(a==b && a==c && b==c)
 System.out.println("這是正三角形");
 else

 System.out.println("這不是正三角形");
 }
 }
