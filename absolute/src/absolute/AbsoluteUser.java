package absolute;
import java.util.Scanner;

public class AbsoluteUser {

	public static void main(String[] args) {
	System.out.println("enter number");
	Scanner obj= new  Scanner(System.in);
	int a =obj.nextInt();
	int absNum=a;
	if(a<0) {
		absNum=-a;
	}
		System.out.println("the absolute num is"+absNum);	
}
}