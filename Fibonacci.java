import java.util.Scanner;

class fib{
  void method(int number){
    int first = 0;
    int sec = 1, third;
    System.out.println("The fibonacci series for the given number is :");
    System.out.println(first);
    for (int i = 0; i <= number; i++) {
      third = first + sec;
      first = sec;
      sec = third;
      System.out.println(first);
    }
  }
    
}

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner get = new Scanner(System.in);
    fib obj=new fib();
    int num= get.nextInt();
    obj.method(num);
    
    get.close();
    
  }
}