import java.util.Scanner;

public class UserRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				int a;int b;

				Scanner obj =new Scanner(System.in);
		
				
				System.out.println("enter  a");
			
				a=obj.nextInt();
				
				
		
				System.out.println("enter  b");b=obj.nextInt();
				for(int i=a;i<=b;i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
					}
				}
				
				
	}}
