package SivaTestPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="karnataka";
List<Character> list= new ArrayList<>();
Map<Character ,Integer> map= new HashMap<>();
for(int i=0;i<str.length();i++)
{
	if(!list.contains(str.charAt(i))){
	list.add(str.charAt(i));
	map.put(str.charAt(i), 1);
	}
	else
	{
		map.put(str.charAt(i), map.get(str.charAt(i))+1);
		
	}
}
System.out.println(list.toString());
System.out.println(map.toString());
	}

}
