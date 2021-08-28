import java.util.Scanner;
class addcl{ 
  int  sum(int frst,int sec){

  return (frst+sec);
  }
  
}
public class add{
  public static void main(String[] args) {
   System.out.println("Enter two numbers:");
   Scanner toadd= new Scanner(System.in);
   addcl obj=new addcl();
   int first=toadd.nextInt();
   int sec=toadd.nextInt();
   int res=obj.sum(first,sec);
   
   System.out.println("The addition of two given number is:"+res);
   toadd.close();
  }
}