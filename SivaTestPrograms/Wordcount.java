package SivaTestPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello world to hello program world";
String[] strarr=str.split(" ");
List<String> list= new ArrayList<>();
Map<String ,Integer> map= new HashMap<>();
for(int i=0;i<strarr.length;i++)
{
	if(!list.contains(strarr[i]))
	{
		list.add(strarr[i]);
		map.put(strarr[i], 1);
		
	}
	else
	{
		map.put(strarr[i], map.get(strarr[i])+1);
	}
}
System.out.println(list.toString());
System.out.println(map.toString());
	}

}
