import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.hashCode();

		if (n1 > n2 && n1 > n3)
			System.out.println("n1 is the maximum");
		else if (n2 > n1 && n2 > n3)
			System.out.println("n2 is the maximum");
		else
			System.out.println("n3 is the maximum");

	}

}
