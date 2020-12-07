import java.util.Scanner;
import java.util.Stack;

public class MinMAxStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
	       Scanner sc = new Scanner(System.in);
	       int N = sc.nextInt();
	       while(N != 0){
	          //sc.next();
	          String input = sc.next();
	           st.push(Integer.parseInt(input));
	           N--;
	       }
	       maxMin(st);

	}
	 public static void maxMin(Stack<Integer> st){
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         if(st.size() != 0){
             while(st.size() != 0){
                 int ele = st.pop();
                 min = Math.min(min,ele);
                 max = Math.max(max , ele);
             }
         }
         System.out.println(min + " " +max);
     }

}
