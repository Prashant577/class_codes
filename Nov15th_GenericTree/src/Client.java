
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		//int arr[]= {10,20,30,40,50,60,70};
		int arr2[]= {1,2,1,-1,1,-1,1,-1,-1,3,-1,2,1,-1,2,-1,1,-1,-1,-1};
		GenericTree gt=new GenericTree(arr2);
		//gt.display();
//		System.out.println(gt.size2());
//		System.out.println(gt.max());
//		System.out.println(gt.find(20));
//		System.out.println(gt.height());
		System.out.println(gt.nodetorootpath(80));
//		gt.removeLeaves();
//		gt.display();
		//gt.postorder();
		//gt.levelorderLineWise();
//		gt.mirror();
//		gt.display();
	//	System.out.println(gt.lca(120, 70));
		
	
		
		
	}
	
	
	

}
