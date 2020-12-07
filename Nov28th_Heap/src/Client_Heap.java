import java.util.Collections;
import java.util.PriorityQueue;

public class Client_Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int[] arr = { 2, 5, 1, 8, 3, 0, 11 };
//		Heap h = new Heap(arr, false));
//		h.display();
//		h.add(10);
//		h.add(30);
//		h.add(9);
//		h.add(15);
//		h.add(40);
//        h.display();
	int[] arr = { 4, 3, 2, 6 };
	nRopes(arr);

	}
	public static void nRopes(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int val : arr) {
			pq.add(val);
		}

		int cost = 0;
		while (pq.size() > 1) {
			int min = pq.poll();
			int sec_min = pq.poll();
			cost += min + sec_min;
			pq.add(min + sec_min);
		}

		System.out.println(cost);
	}

}
