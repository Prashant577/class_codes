import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int coloumn=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=coloumn;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
