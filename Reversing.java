import java.util.Scanner;

class toreverse{
  void rev(String input){
    int length=input.length();
   String rev="";
   for(int i=length-1;i>=0;i--){
     rev=rev+input.charAt(i);
   }
   System.out.println("Entered string:"+input);
   System.out.println("Reversed string:"+rev);
  }
}

public class Reversing {
  public static void main(String[] args) {
   System.out.println("Enter a string:");
   Scanner togetstring= new Scanner(System.in);
   String input=togetstring.next();
   toreverse obj=new toreverse();
   obj.rev(input);
   
  }
}