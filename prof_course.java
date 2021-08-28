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
		System.out.println((mat >= 60 && phy >= 50 && che >= 40 && total >= 200) ? "\nYou are Eligible..!!" : "Your are not Eligible..!!");
	}
}

public class prof_course {
	public static void main(String[] args) {
		Scanner getmark = new Scanner(System.in);
		System.out.print("Enter your marks in Maths:");
		int x= getmark.nextInt();
		System.out.print("Enter your marks in Chemistry:");
		int y= getmark.nextInt();
		System.out.print("Enter your marks in physics:");
		int z= getmark.nextInt();
		subj obj = new subj(x,y,z);
		obj.calc();
	}
}
