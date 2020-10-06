import java.util.Scanner;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int avg=(s1+s2+s3)/3;
		if((avg>=90) && (avg<=100))
		{
			System.out.println("grade A");
		}
		else if(avg>=80 && avg<90)
		{
			System.out.println("grade b");
	}
		
		else if(avg>=70 && avg<80)
	{
		System.out.println("grade c");
	}
		else if(avg>=60 && avg<70)
		{
			System.out.println("grade d");
		}
		else
		{
			System.out.println("grade f");
		}
	}
}
