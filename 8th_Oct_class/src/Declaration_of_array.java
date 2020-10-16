import java.util.Scanner;

public class Declaration_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println(); //print next line
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt(); //take input from user
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "); //print the input from the user
		}
		
	}

}
