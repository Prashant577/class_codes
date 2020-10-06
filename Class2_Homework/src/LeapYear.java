import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
					System.out.println("yes");
				else
					System.out.println("no");
			}
			else
			{
				System.out.println("yes");
			}
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
