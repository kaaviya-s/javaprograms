import java.util.Scanner;

class tables{
  void fivetable(int limit){
    System.out.println("The multiplication table of 5");
   for(int i=1;i<=limit;i++){
     System.out.println("5 x "+i+" = "+5*i);
   } 
  }
}

public class multifive{
  public static void main(String[] args) {
   System.out.println("Enter the limit:");
   Scanner num=new Scanner(System.in);
   tables obj=new tables();
   int limit=num.nextInt();
   obj.fivetable(limit);
   
  }
}