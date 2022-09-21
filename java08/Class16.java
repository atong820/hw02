class CSphere
 {
 private int x; 
 private int y; 
 private int z; 
 private int radius; 

 void setLocation(int a,int b,int c) 
 {
 x=a;
 y=b;
 z=c;
}
 void setRadius(int r)
 {
 radius=r;
 }
 double surfaceArea()
 {
 return 4*3.14*radius*radius*radius;
 }
 double volume()
 {


 return ((double)(3.0/4)*3.14*radius*radius*radius);
 }
 void showCenter()
 {
 System.out.println("x="+x+", y="+y+", z="+z);
 }
 }

 public class Class16
 public static void main(String args[])
 {
 CSphere cs=new CSphere();

 cs.setLocation(3,4,5);
 cs.setRadius(1);
 cs.showCenter();
 System.out.println("surface area="+cs.surfaceArea());
 System.out.println("volume="+cs.volume());
 }
 }
