
public class Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack(10);
		st.push(100);
		st.display();
		st.push(50);
		st.display();
		st.push(10);
		st.display();
		System.out.println(st.pop());
		st.display();
		
	}

}
