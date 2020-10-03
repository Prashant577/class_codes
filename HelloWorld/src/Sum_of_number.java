import java.util.Scanner;

public class Sum_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int max = Integer.MIN_VALUE;
		while (n > i) {
			int input = sc.nextInt();

			if (input > max) {
			max= input;
			}
			i++;
		}
System.out.println(max);
	}

}
