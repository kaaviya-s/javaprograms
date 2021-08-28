import java.util.Scanner;
class findings{
  void calc(int num){
  
    if(num%2==0){
     System.out.println("Given number is an even number");
   }   else{
     System.out.println("Given number is a odd number");   
   }
  }
}
public class oddoreven{
  public static void main(String[] args) {
   System.out.println("Enter a number:");
   Scanner tocheck= new Scanner(System.in);
   findings obj=new findings();
   int a=tocheck.nextInt();
   obj.calc(a);
  }
}
