
public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Queue q=new Queue(5);
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.enqueue(50);
//		q.display();
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		q.display();
//		q.enqueue(100);
//		q.enqueue(120);
//		q.display();
		DynamicQueue dq=new DynamicQueue(5);
		dq.enqueue(100);
		dq.enqueue(200);
		dq.enqueue(300);
		dq.enqueue(400);
		dq.enqueue(500);
		dq.display();
		dq.enqueue(600);
		dq.display();

	}

}
