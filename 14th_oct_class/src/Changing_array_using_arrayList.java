import java.util.ArrayList;

public class Changing_array_using_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,50,5};
		ArrayList <Integer> list2=evenelements(a);
		System.out.println(list2); //print the even elements from the array
		list2.add(1,5); //it will add 5 in the 1st index of the list
		System.out.println(list2);
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
