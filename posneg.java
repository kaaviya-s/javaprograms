import java.util.Scanner;

class find{
  void result(int num){
    if(num>0){
      System.out.println("It is positive number");
    }else{
      System.out.println("It is negative number");
    }
  }
}

public class posneg{
  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner togetnum=new Scanner(System.in);
    find obj=new find();
    int num=togetnum.nextInt();
    obj.result(num);
    
    
  }
}