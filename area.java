import java.util.Scanner;

class findarea{
    void getarea(int len,int bred){
        float area=len*bred;
        System.out.println("The area of the rectangle is:"+area);
    }
    void getarea(float base,float height){
        
        float area=(base*height)/2;
        System.out.println("The area of the triangle is :"+area);
    }
    void getarea(float rad){
        float pi=3.14f;
        float area=4*pi*(rad*rad);
        System.out.println("The area of the sphere is:"+area);
    }
}

public class area {
    public static void main(String args[]){
       Scanner getnum=new Scanner(System.in);
       findarea obj=new findarea();
       System.out.println("Enter the length(for rect):");
       int len=getnum.nextInt();
       System.out.println("Enter the breadth(for rect):");
       int breadth=getnum.nextInt();
       obj.getarea(len,breadth);
       System.out.println("Enter the height(for triangle):");
       float height=getnum.nextInt();
       System.out.println("Enter the base(for triangle):");
       float base=getnum.nextInt();
       obj.getarea(base, height);
       System.out.println("Enter the Radius(for sphere):");
       int rad=getnum.nextInt();
       obj.getarea( rad);

    }
}
