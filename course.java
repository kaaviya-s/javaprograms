import java.util.Scanner;
class subj {
int mat, che, phy, total;
subj(int a, int b, int c) {
mat = a;
che = b;
phy = c;
total = a + b + c;
}
void calc() {
System.out.println((mat >= 60 && phy >= 50 && che >= 40 && total >= 200) ?
"\nYou are Eligible..!!" : "\nYour are not Eligible..!!");
}
}
public class course {
public static void main(String[] args) {
Scanner pc = new Scanner(System.in);
System.out.print("Enter your marks in Maths:");
int x= pc.nextInt();
System.out.print("Enter your marks in Chemistry:");
int y= pc.nextInt();
System.out.print("Enter your marks in Physics:");
int z= pc.nextInt();
subj s = new subj(x,y,z);
s.calc();
}
}