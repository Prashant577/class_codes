import java.util.Scanner;

public class Sum_of_diagonals_in_2D_array {

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
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int diagonal1=0,diagonal2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j)
				{
					diagonal1 +=a[i][j];
				}
				if((i+j)==(a.length-1))
				{
					diagonal2 +=a[i][j];
				}
			}
		}
		System.out.println(diagonal1+" "+diagonal2);
		//using one for loop for printing the sum of diagonal element instead of two
		int temp1=0,temp2=0;
		for(int i=0,j=0;i<a.length;i++,j++)
		{
			if(i==j)
			{
				temp1 +=a[i][j];
			}
			
		}
		for(int i=0,j=0;j<a[0].length;i++,j++)
		{
			if((i+j)==(a.length-1))
			{
				temp2 +=a[i][j];
			}
			
		}

		System.out.println(temp1+" "+temp2);
	}

}
