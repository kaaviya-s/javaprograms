import java.util.Scanner;

class big{
  void find(int a,int b,int c){
    if((a>b)&&(a>c)){
     System.out.println("The number "+a+" is greatest of all");
   }else if((b>c)&&(b>a)){
     System.out.println("The number "+b+" is greatest of all");
   }else{
     System.out.println("The number "+c+" is greatest of all");
   }
  }
}

public class Greatestofall {
  public static void main(String[] args) {
   System.out.println("Enter three numbers:");
   Scanner get= new Scanner(System.in);
   big obj=new big();
   int a=get.nextInt();
   int b=get.nextInt();
   int c=get.nextInt();
   obj.find(a,b,c);
   
  }
}