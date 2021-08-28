import java.util.Scanner;

class findings{
  void prime(int var){
    int count=0;
   for (int i=1;i<=var;i++){
       if(var%i==0){
           count++;
       }
   }
   if(count==2){
       System.out.println("It is a prime number");
    }else{
    System.out.println("It is not a prime number");
    }
  }
}

public class Primenumber{
  public static void main(String[] args) {
   System.out.println("Enter a number:");
   Scanner togetno= new Scanner(System.in);
   findings obj=new findings();
   int var=togetno.nextInt();
   obj.prime(var);
   
    
  }
}