import java.util.Scanner;

public class Transpose_of_the_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<a.length;j++)
		{
			for(int i=0;i<a[0].length;i++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
