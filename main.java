import java.util.Scanner;
import java.util.Arrays;
public class main {
  public static void main(String[] args) {
    System.out.println("Enter the string:");
    Scanner getstring=new Scanner(System.in);
    String str=getstring.nextLine();
    char[] arr=str.toCharArray();
    Arrays.sort(arr);
    String modified=new String(arr);
    System.out.println(modified);
  }
}