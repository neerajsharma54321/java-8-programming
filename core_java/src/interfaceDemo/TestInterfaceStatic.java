package interfaceDemo;
interface I1{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements I1{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
public class TestInterfaceStatic{  
public static void main(String args[]){  
I1 d= new Rectangle();  
d.draw();  
System.out.println(I1.cube(3));
// System.out.println(d.cube(3));
}} 