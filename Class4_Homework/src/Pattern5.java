import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(row-i)*2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
