import java.util.Scanner;
import java.util.Arrays;
public class mine{
  public static void main(String[] args) {
    System.out.println("Enter the string:");
    Scanner getstring=new Scanner(System.in);
    String str=getstring.nextLine();
    String[] sc=str.split(" ");
    for(String words:sc){

        char[] arr=words.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr); 
    }
    
  }
}