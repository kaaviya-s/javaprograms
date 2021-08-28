import java.util.Scanner;

class find{
    void temp(float  f){
        float c= ((f-32)*5)/9;  
        System.out.println("Temp in celsius is: "+c);  }
}

public class celsius_fahrenheit {  
   public static void main (String args[]) { 
     float f;
     Scanner cf=new Scanner(System.in);
     System.out.print("Enter Fahrenheit: ");
     f =cf.nextInt();
     find obj=new find();
     obj.temp(f);
     
    }
}