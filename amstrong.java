import java.util.Scanner;

class ams{
    void find(int num){
        int sum=0;
        int dup;
        int temp=num;
        while(num>0){
            dup=num%10;
            sum=sum+(dup*dup*dup);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("The given number is an amstrong number");
        }else{
            System.out.println("It is not");
        }
    }
}

public class amstrong{
    public static void main(String[] args){
        
       
        System.out.println("Enter a number:");
        Scanner get =new Scanner(System.in);
        int number=get.nextInt();
        ams obj=new ams();
        obj.find(number);
        
    }
}