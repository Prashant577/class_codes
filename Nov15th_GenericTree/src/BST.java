
public class BST {
	Node root;
	int size;
	private class Node{
		int data;
		Node left;
		Node right;
	}
	
	

	public BST(int[] sa)
	{
		root=construct(sa,0,sa.length-1);
	}
	
	private Node construct(int[] sa, int lo,int hi) {
		if(lo>hi)
		{
			return null;
		}
		Node node=new Node();
		int mid=(lo+hi)/2;
		node.data=sa[mid];
		node.left=construct(sa,lo,mid-1);
		node.right=construct(sa,mid+1,hi);
		return node;
	}
	
	public void display() {
		display(root);
	}
	
	public void display(Node node) {
		if(node.left!=null) {
			System.out.println(node.left.data);
		}
		else
		{
			System.out.println(".");
		}
		System.out.println("<--"+node.data+"-->");
		if(node.right!=null)
		{
			System.out.println(node.right.data);
		}
		else
		{
			System.out.println(".");
		}
		display(node.left);
		display(node.right);
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		if(node.right==null)
		{
			return node.data;
		}
		return max(node.right);
	}
	
	public int min() {
		return min(root);
	}
	
	private int min(Node node) {
		if(node.left==null)
		{
			return node.data;
		}
		return max(node.left);
	}
	
	public Node find(int data)
	{
		return find(root,data);
	}
	
	private Node find(Node node, int data)
	{
		if(node==null || node.data==data)
		{
			return node;
		}
		if(node.data<data)
		{
			return find(node.right,data);
		}
		return find(node.left,data);
	}
	
	public boolean find1(int data)
	{
		return find1(root,data);
	}
	
	private boolean find1(Node node,int data)
	{
		if(node==null)
		{
			return false;
		}
		if(node.data==data)
		{
			return true;
		}
		if(data<node.data)
		{
			return find1(node.left,data);
		}
		else
		{
			return find1(node.right,data);
		}
	}
	
	public void pir(int lo,int hi)
	{
		pir(root,lo,hi);
	}
	
	private void pir(Node node,int lo,int hi)
	{
		if(node==null)
		{
			return;
		}
		if(node.data<lo)
		{
			pir(node.right,lo,hi);
		}
		else if(node.data>hi)
		{
			pir(node.right,lo,hi);
		}
		else
		{
			pir(node.left,lo,hi);
			System.out.println(node.data+" ");
			pir(node.right,lo,hi);
		}
	}
	
	private int sumtillnow;
	public void rwson() {
		sumtillnow=0;
		rwson(root);
	}
	
	private void rwson(Node node) {
		rwson(node.right);
		
		sumtillnow+=node.data;
		node.data=sumtillnow;
		rwson(node.left);
	}
	
	public void add(int data)
	{
		root=add(root,data);
	}
	
	private Node add(Node node, int data)
	{
		if(node==null)
		{
			Node temp=new Node();
			temp.data=data;
			return temp;
		}
		
		if(data>node.data)
		{
			node.right=add(node.right,data);
		}
		else
		{
			node.left=add(node.left,data);
		}
		return node;
	}
	
	public void remove(int data)
	{
		root=remove(root,data);
	}
	
	private Node remove(Node node,int data)
	{
		if(data>node.data)
		{
			node.right=remove(node.right,data);
		}
		else if(data<node.data)
		{
			node.left=remove(node.left,data);
		}
		else
		{
			if(node.left==null  && node.right==null)
			{
				return null;
			}
			else if(node.right==null)
			{
				return node.left;
			}
			else if(node.left==null)
			{
				return node.right;
			}
			else
			{
				int lmax=max(node.left);
				node.data=lmax;
				node.left=remove(node.left,lmax);
			}
		}
		return node;
	}
}
