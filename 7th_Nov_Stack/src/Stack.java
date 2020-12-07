
public class Stack {
	int data[];
	int toss;
	Stack(int cap)
	{
		this.data=new int[cap];
		toss=-1;
	}
	public void push(int item) throws Exception{
		if(this.toss==this.data.length-1)
		{
			throw new Exception("stack is full");
		}
		this.toss++;
		this.data[this.toss]=item;
	}
	public int top() throws Exception{
		if(this.toss==-1)
		{
			throw new Exception("stack is empty");
		}
		int returnvalue=this.data[this.toss];
		return returnvalue;
		
	}
	public int pop() throws Exception{
		if(this.toss==-1)
		{
			throw new Exception("stack is empty");
		}
		int rv=this.data[this.toss];
		this.toss--;
		return rv;
	}
	public int size()
	{
		return toss+1;
	}
	public boolean isEmpty()
	{
	return	this.toss==-1?true:false;
	}
	public void display()
	{
		System.out.println("------------");
		for(int i=this.toss;i>=0;i--)
		{
			System.out.print(this.data[i]+", ");
		}
		System.out.println(".");
		System.out.println("-----------");
	}

}
