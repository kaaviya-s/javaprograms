import java.util.Scanner;
class array{
void str_arr(){
Scanner s= new Scanner(System.in);
System.out.print("Enter the strings to store in an array (with spaces): ");
String[] array = s.nextLine().split(" ");
System.out.println("\nList of strings in an Array list:");
for(int i=0;i<array.length;i++)
System.out.println(array[i]);
}
}
public class arr_list{
public static void main(String[] args) {
array a=new array();
a.str_arr();
}
}