import java.util.Scanner;

public class Sum_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum;
		int again;
		
		do {
			sum=a+b;
			System.out.println(sum);
			System.out.println("do you further operation");
			again=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
		}while(again==1);
		
			
	}


}
