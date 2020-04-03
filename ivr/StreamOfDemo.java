package ivr;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {1,8,5,2,6,7,3,9};
		
		Stream<Integer> s1=Stream.of(arr);
		List<Integer> a=s1.sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		a.forEach(System.out::println);

	}

}
