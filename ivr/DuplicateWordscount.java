package ivr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateWordscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list= new ArrayList<>();
Map<String,Integer> map= new HashMap<>();
String str="Welcome to the incture to grab the development knowledge to your carrier";
String arr[]=str.split(" ");
for (int i = 0; i < arr.length; i++) {
	

if(!list.contains(arr[i]))
{
	list.add(arr[i]);
	map.put(arr[i], 1);
	
}
else
{
	map.put(arr[i], map.get(arr[i])+1);
}
}
System.out.println("list values"+list.toString());
System.out.println("map values"+map.toString());

	}

}
