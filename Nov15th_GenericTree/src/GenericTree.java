import java.util.*;
public class GenericTree {
	private class Node{
		int data;
		ArrayList<Node> children=new ArrayList<>();		
	}
	private Node root;
	private int size;
	
	public GenericTree(int arr[])
	{
		Stack<Node> st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==-1)
			{
				st.pop();
			}
			else
			{
				Node node=new Node();
				this.size++;
				node.data=arr[i];
				if(st.size()>0)
				{
					st.peek().children.add(node);
				}
				else
				{
					this.root=node;
				}
				st.push(node);
			}
		}
	}
	
	public void display() {
		display(root);
	}
	
	private void display(Node node)
	{
		System.out.print(node.data+"->");
		for(Node child:node.children)
		{
			System.out.print(child.data+",");
		}
		System.out.println(".");
		for(Node child:node.children)
		{
			display(child);
		}
	}
	
	public int size2()
	{
		return size2(root);
	}
	
	private int size2(Node node)
	{
		int size=0;
		for(Node child:node.children)
		{
			int childrensize=size2(child);
			size+=childrensize;
		}
		size++;
		return size;
	}
	
	public int max()
	{
		return max(root);
	}
	
	private int max(Node node)
	{
		int max=node.data;
		for(Node child:node.children)
		{
			int childmax=max(child);
			max=Math.max(childmax, max);
		}
		return max;
	}
	
	public boolean find(int data)
	{
		return find(root,data);
	}
	
	private boolean find(Node node,int data)
	{
		if(node.data==data)
		{
			return true;
		}
		for(Node child:node.children)
		{
			boolean findChild=find(child,data);
			if(findChild==true)
			{
				return true;
			}
			
		}
		return false;
	}
	public int height()
	{
		return height(root);
	}
	
	private int height(Node node)
	{
		int ht=0;
		for(Node child:node.children)
		{
			int childheight=height(child);
			ht=Math.max(childheight, ht);
		}
		ht+=1;
		return ht;
	}
	
	public ArrayList<Integer> nodetorootpath(int data)
	{
		return nodetorootpath(root,data);
	}
	
	private ArrayList<Integer> nodetorootpath(Node node, int data)
	{
		if(node.data==data)
		{
			ArrayList<Integer> baseRes=new ArrayList<>();
			baseRes.add(node.data);
			return baseRes;
		}
		for(Node child:node.children)
		{
			ArrayList<Integer> rr=nodetorootpath(child,data);
			if(rr.size()>0)
			{
				rr.add(node.data);
				return rr;
			}
		}
		return new ArrayList<>();
	}
	
	public void removeLeaves()
	{
				removeLeaves(root);
	}
	
	private void removeLeaves(Node node)
	{
		for(int i=node.children.size()-1;i>=0;i--)
		{
			Node child=node.children.get(i);
			if(child.children.size()==0)
			{
				node.children.remove(child);
			}
			else
			{
				removeLeaves(child);
			}
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	
	private void preorder(Node node)
	{
		System.out.println(node.data+" ");
		for(Node child:node.children)
		{
			preorder(child);
		}
	}
	
	public void postorder()
	{
		postorder(root);
	}
	
	private void postorder(Node node)
	{
		
		for(Node child:node.children)
		{
			preorder(child);
		}
		System.out.println(node.data+" ");
	}
	
	public void levelorder()
	{
		LinkedList<Node> q=new LinkedList<>();
		q.addLast(this.root);
		while(q.size()>0)
		{
			Node node=q.removeFirst();
			System.out.println(node.data+" ");
			for(Node child:node.children)
			{
				q.addLast(child);
			}
		}
		System.out.println();
	}
	
	public void levelorderLineWise()
	{
		LinkedList<Node> currq=new LinkedList<GenericTree.Node>();
		LinkedList<Node> nextq=new LinkedList<GenericTree.Node>();
		currq.addLast(this.root);
		while(currq.size()>0)
		{
			Node node=currq.removeFirst();
			System.out.print(node.data+" ");
			for(Node child:node.children)
			{
				nextq.addLast(child);
			}
			if(currq.size()==0)
			{
				currq=nextq;
				nextq=new LinkedList<GenericTree.Node>();
				System.out.println();
			}
			
		}
	}
	
	public void printlevelorderzigzag() {
		Stack<Node> currstack=new Stack<>();
		Stack<Node> nextstack=new Stack<>();
		currstack.push(this.root);
		int level=0;
		while(currstack.size()>0)
		{
			Node node=currstack.pop();
			
			System.out.println(node.data+" ");
			if(level%2==0)
			{
				for(int i=0;i<node.children.size();i++)
				{
					nextstack.push(node.children.get(i));
				}
			}
			else
			{
				for(int i=node.children.size()-1;i>=0;i--)
				{
					nextstack.push(node.children.get(i));
				}
			}
			if(currstack.size()==0)
			{
				currstack=nextstack;
				nextstack=new Stack<>();
				System.out.println();
				level++;
			}
		}
	}
	public void mirror()
	{
		mirror(root);
	}
	
	private void mirror(Node node){
		for(Node child:node.children)
		{
			mirror(child);
		}
		Collections.reverse(node.children);
	}
	
	public int lca(int d1,int d2)  //lca=least common ancestor
	{
		ArrayList<Integer> pathA=nodetorootpath(d1);
		Collections.reverse(pathA);
		ArrayList<Integer> pathB=nodetorootpath(d2);
		Collections.reverse(pathB);
		int i=0;
		while(i<pathA.size() && i<pathB.size() && pathA.get(i)==pathB.get(i))
		{
			i++;
		}
		
		return pathA.get(i-1);
	}
	
	public boolean isMirror(Node node1, Node node2)
	{
		if(node1.children.size()!=node2.children.size())
		{
			return false;
		}
		for(int i=0;i<node1.children.size();i++)
		{
			int j=node2.children.size()-1-i;
			Node c1=node1.children.get(i);
			Node c2=node2.children.get(j);
			if(isMirror(c1,c2)==false)
			{
				return false;
			}
			
		}
		return true;
	}
	
	public boolean isSymmetric(Node node)
	{
		return isMirror(node,node);
	}
	
	private void linearize(Node root) {
		// linearise all node
		for(Node child:root.children) {
			linearize(child);
		}
		for(int i = root.children.size()-1;i>0;i--) {
			Node lc = root.children.remove(i);
			Node sl = root.children.get(i-1);
			Node slTail = getTail(sl);
			slTail.children.add(lc);
		}
	}
	private Node getTail(Node node) {
		Node temp = node;
		while(temp.children.size() != 0) {
			temp = temp.children.get(0);
		}
		return temp;
	}
	public void linarize() {
		linearize(root);
	}
	
	

}
