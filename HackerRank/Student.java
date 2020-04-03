package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	int enrollmentNumber;
	String name;
	
	static List<Student> list = new ArrayList<Student>();
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return enrollmentNumber + ": "+ name;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(args.length);
		
		if(args!= null && args.length > 0) {
			int noOfStudetns = Integer.parseInt(args[0]);
			System.out.println(noOfStudetns);
			
			for (int i = 0; i < noOfStudetns; i++) {
				Scanner reader = new Scanner((System.in));
				Student obj = new Student(reader.next());
				obj.enrollmentNumber = i+1;
				list.add(obj);
			}
			
		}
		
		for (Student obj : list) {
			System.out.println(obj.toString());
		}
		
	}

}
