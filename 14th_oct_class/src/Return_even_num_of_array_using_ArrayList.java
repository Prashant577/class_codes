import java.util.*;
public class Return_even_num_of_array_using_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,50,5};
		System.out.println(evenelements(a));
	}
	public static ArrayList<Integer> evenelements(int a[])
	{
		ArrayList <Integer> list=new ArrayList<>();
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
