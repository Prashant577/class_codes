import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y%4==0 && y%400==0)
		{
			System.out.println("leap year");
		}
		else if(y%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}
