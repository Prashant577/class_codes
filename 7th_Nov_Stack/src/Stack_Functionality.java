import java.util.Stack;

public class Stack_Functionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(50);
		int top=s.pop();
		System.out.println(top);
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println(s.isEmpty());
	}

}
