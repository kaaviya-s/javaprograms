import java.util.Scanner;

class calculate{
    void palin(int num){
        int sum=0;
        int dup;
        int temp=num;
        while(num>0){
            dup=num%10;
            sum=(sum*10)+dup;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("The given number is an palindrome");
        }else{
            System.out.println("It is not");
        }
    }
}

public class palindrome{
    public static void main(String[] args){
        
        System.out.println("Enter a number:");
        Scanner get =new Scanner(System.in);
        int number=get.nextInt();
        calculate obj=new calculate();
        obj.palin(number);
    
    }
}