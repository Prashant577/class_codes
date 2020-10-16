import java.util.*;

public class Remove_element_from_array_using_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,40,60,50,55,81};
		ArrayList<Integer> list2=removeElements(a);
		System.out.println(list2);
		list2.remove(3);
		System.out.println(list2);
		//for iterating the elements using ArrayList
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
		for(int j:list2)
		{
			System.out.print(j+" ");
		}
	}
	public static ArrayList<Integer> removeElements(int a[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				list.add(a[i]);
			}
		}
		return list;
	}

}
