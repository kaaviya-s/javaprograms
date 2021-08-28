import java.util.Scanner;
class alpha{
    void findings(char var){
        if(var=='a'|| var=='e'|| var=='i'|| var=='o'|| var=='u' || var=='A' || var=='E'|| var=='I'|| var=='O'|| var=='U'){
            System.out.println(var+"is vowel");
        }else{
            System.out.println(var+"is constant");
        }
    }
}

public class findalpha{
    public static void main(String[] args){
        System.out.println("Enter the character:");
        Scanner toget=new Scanner(System.in);
        alpha obj=new alpha();
        char a =toget.next().charAt(0);
        obj.findings(a);

    }
}