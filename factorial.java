import java.util.Scanner;

import jdk.internal.org.jline.terminal.Terminal.MouseTracking;

public class factorial {
  int tofindfac(int n){
    if ((n == 0) || (n == 1)) {
      return 1;
    } else {
      return (n * tofindfac(n - 1));
    }
  }MouseTracking
 
  }


  public static void main(String[] args) {
    System.out.println("Enter a number:");
    //int fact = 1;
    Scanner tofac = new Scanner(System.in);
    factorial obj=new factorial();
    int n=tofac.nextInt();
    
    int result=obj.tofindfac(n);
    System.out.println(result);
    tofac.close();
  }
}