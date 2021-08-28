import java.util.Scanner;

class rev{
  void print(){
    for(int i=10;i>=0;i--){
    System.out.println(i);
    }
  }
}

public class noreverse {
  public static void main(String[] args) {
    rev obj=new rev();
    obj.print();
  }
}