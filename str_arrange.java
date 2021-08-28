import java.util.*;
class string_arrange {
void s_arr() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the strings (with spaces): ");
String[] s = sc.nextLine().split(" ");
System.out.print("The sorted string array: ");
Arrays.sort(s);
System.out.print(Arrays.toString(s));
}
}
public class str_arrange {
public static void main(String[] args) {
string_arrange s = new string_arrange();
s.s_arr();
}
}