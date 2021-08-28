import java.util.Scanner;

class year{
    void findleap(int year){
        if((year%400==0)||((year%4==0)&&(year%100!=0))){
            System.out.println("It is a leap year");
        }else{
             System.out.println("It is not a leap year");
        }
    }
}

public class leap{
    public static void main(String[] args){
        System.out.println("Enter a year:");
        Scanner number=new Scanner(System.in);
        year obj=new year();
        int year=number.nextInt();
        obj.findleap(year);
        
    }
}