import java.util.ArrayList;
import java.util.HashMap;

public class HASHMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap=new HashMap();
		hmap.put("India", 100);
		hmap.put("Pkistan", 10);
		hmap.put("Australia", 50);
		System.out.println(hmap);
		System.out.println(hmap.containsKey("Pkistan"));
		hmap.remove("Pkistan");
		System.out.println(hmap);
		System.out.println(hmap.get("India"));
		
		ArrayList<String> list=new ArrayList<String>(hmap.keySet());
		System.out.println(list);
		highestFrequencyChar("geekster");

	}
	
	public static void highestFrequencyChar(String word)
	{
		HashMap<Character,Integer> fmap=new HashMap<Character,Integer>();
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(fmap.containsKey(ch))
			{
				fmap.put(ch, fmap.get(ch)+1);
			}
			else
			{
				fmap.put(ch, 1);
			}
		}
		ArrayList<Character> list=new ArrayList<Character>(fmap.keySet());
		int max=0;
		char ans='\0';
		
		for(int i=0;i<list.size();i++)
		{
			char ch=list.get(i);
			int charfreq=fmap.get(ch);
			if(charfreq>max)
			{
				max=charfreq;
				ans=ch;
			}
		}
		System.out.println(ans);
	}

}
