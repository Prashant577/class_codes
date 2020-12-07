package DEC3_hash_fucntion;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hash_function<k,v> {
	
	private class HMNode{
		k key;
		v value;
		
		public HMNode(k key,v value)
		{
			this.key=key;
			this.value=value;
		}
	}
	
	private LinkedList<HMNode>[] buckets;
	private int size=0;
	private int[] arr;
	
	private int hashFunctions(k key) {
		int hc = key.hashCode();
		return Math.abs(hc) % buckets.length;
	}
	
	public void put(k key,v value)
	{
		int bi=hashFucntions(key);
		HMNode hmnode=findwithinbuckets(bi,key);
		if(hmnode==null)
		{
			hmnode=new HMNode(key,value);
			buckets[bi].addLast(hmnode);
			this.size++;
		}
		else
		{
			hmnode.value=value;
		}
		double lamda=(this.size*1.0)/buckets.length;
		if(lamda>2.0)
		{
			rehash();
		}
	}

	private void rehash() {
		// TODO Auto-generated method stub
		LinkedList<HMNode>[] oba=buckets;
		buckets=new LinkedList[2*buckets.length];
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i]=new LinkedList<>();
		}
		this.size=0;
		for(int bi=0;bi<oba.length;bi++)
		{
			for(int di=0;di<oba[bi].size();di++)
			{
				HMNode hmnode=oba[bi].get(di);
				put(hmnode.key,hmnode.value);
			}
		}
		
	}

	private HMNode findwithinbuckets(int bi, k key) {
		// TODO Auto-generated method stub
		for(int di=0;di<buckets[bi].size();di++)
		{
			HMNode hmnode=buckets[bi].get(di);
			if(hmnode.key.equals(key))
			{
				return hmnode;
			}
		}
		return null;
	}

	private int hashFucntions(k key) {
		// TODO Auto-generated method stub
		int hc=key.hashCode();
		return Math.abs(hc)%buckets.length;
	}
	
	public boolean containsKey(k key)
	{
		int bi=hashFucntions(key);
		HMNode hmnode=findwithinbuckets(bi,key);
		if(hmnode==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public v remove(k key)
	{
		int bi=hashFucntions(key);
		HMNode hmnode=findwithinbuckets(bi,key);
		if(hmnode==null)
		{
			return null;
		}
		else
		{
			return hmnode.value;
		}
	}
	
	public ArrayList<k> keyset()
	{
		ArrayList<k> keys=new ArrayList<>();
		for(int i=0;i<buckets.length;i++)
		{
			for(int di=0;di<buckets[i].size();di++)
			{
				keys.add(buckets[i].get(di).key);
			}
		}
		return keys;
	}
	
	public void display() {
		System.out.println("`````````````````````````````````");
		for (int i = 0; i < buckets.length; i++) {
			System.out.print("B" + i + "-");
			for (int di = 0; di < buckets[i].size(); di++) {
				HMNode hmnode = buckets[i].get(di);
				System.out.print("{" + hmnode.key + "=" + hmnode.value + "}, ");
			}
			System.out.println();
		}
	}
	
	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

}
