
public class DynamicQueue extends Queue {
	
	DynamicQueue(int cap) {
		super(cap);
	}
	@Override
	public void enqueue(int val) throws Exception{
		if(this.size==this.data.length)
		{
			int[] oa=data;  //here data is not getting copied to other array(oa), instead oa is a referece that is pointing the data stored in heap
			data=new int[2*oa.length]; //size of the new array is 2*oa
			for(int i=0;i<size;i++)
			{
				data[i]=oa[(i+front)%oa.length];
			}
			front=0;
			rear=this.size-1;
		}
		
		this.rear++;
		this.rear=this.rear%data.length;
		this.data[this.rear]=val;
		if(this.front==-1)
		{
			this.front++;
		}
		this.size++;
	}

}
