import java.util.Scanner;

public class Meaning_of_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char grade=sc.next().charAt(0);
		
		switch(grade)
		{
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("average");
			break;
		case 'D':
			System.out.println("deficient");
			break;
		case 'F':
			System.out.println("failing");
			break;
		default:
			System.out.println("enter valid key");
		}
		
	
	
	}

}
