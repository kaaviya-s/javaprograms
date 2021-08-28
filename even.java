import java.util.Scanner;

public class even{
  public static void main(String[] args) {
    int sum=0;
   System.out.println("Sum of even numbers between 1 to 100:");
   for(int i=1;i<=100;i++){
     if(i%2==0){
      System.out.print(i+"\t");
     }else{
       continue;
     }
   }
   System.out.println(sum);
  }
}
