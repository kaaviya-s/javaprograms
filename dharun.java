import java.util.Arrays;
import java.util.Scanner;
public class dharun{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] set = sc.nextLine().split(" ");
        Arrays.sort(set);
        System.out.println(Arrays.asList(set));
        sc.close();
    }
}