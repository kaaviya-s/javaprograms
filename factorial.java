import java.util.Scanner;


class fact {
  int tofindfac(int n){
    if ((n == 0) || (n == 1)) {
      return 1;
    } else {
      return (n * tofindfac(n - 1));
    }
  }
 
}

 public class factorial{
 public static void main(String[] args) {
    System.out.println("Enter a number:");
    //int fact = 1;
    Scanner tofac = new Scanner(System.in);
    fact obj=new fact();
    int n=tofac.nextInt();
    
    int result=obj.tofindfac(n);
    System.out.println(result);
    tofac.close();
  }
 }
  
