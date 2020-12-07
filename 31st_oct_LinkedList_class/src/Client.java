
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.AddLast(5);
		l1.AddLast(10);
		l1.AddLast(15);
		l1.addFirst(20);
		l1.removefirst();
		l1.display();
		l1.getAt(1);
		l1.display();
		l1.removeAt(1);
		l1.display();
		l1.addFirst(50);
		l1.AddLast(60);
		l1.addFirst(55);
		l1.display();
		l1.middlenode();
		l1.KFromEle(1);
		l1.display();
		LinkedList l2 = new LinkedList();
		l2.AddLast(5);
		l2.AddLast(15);
		l2.AddLast(20);
		l2.AddLast(50);
		l2.display();

		LinkedList l3 = LinkedList.mergeTwoSortedLists(l1, l2);
		
		l3.display();
		
	}
	public static LinkedList mergeTwoSortedLists2(LinkedList l1, LinkedList l2) {
		LinkedList res = new LinkedList();
		while (l1.getsize() > 0 && l2.getsize() > 0) {
			int val1 = l1.getfirst();
			int val2 = l2.getfirst();
			if (val1 < val2) {
				res.AddLast(val1);
				l1.removefirst();
			} else {
				res.AddLast(val2);
				l2.removefirst();
			}
		}

		while (l1.getsize() > 0) {
			int val = l1.getfirst();
			res.AddLast(val);
			l1.removefirst();
		}

		while (l2.getsize() > 0) {
			int val = l2.getfirst();

			res.AddLast(val);
			l2.removefirst();

		}

		return res;
	}


}
