import java.util.Scanner;

class calc{
    void find(float r,float h){
     double pi=3.14,area;
     area=(pi*r*r)+(2*pi*r*h);
     System.out.println("Area= "+area);
    }
}

public class eqn{  
   public static void main (String args[]) { 
    float r,h;
     Scanner a=new Scanner(System.in);
     System.out.print("Enter the radius: ");
     r=a.nextFloat();
     System.out.print("Enter the height: ");
     h=a.nextFloat();
     calc obj=new calc();
     obj.find(r,h);
     
  }
}