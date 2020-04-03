package java8;

import java.util.Comparator;

public class Employee  {
 private String name;
 private int no;
 private int age;
 
 public Employee(String name,int no,int age) {
	this.name=name;
	this.no=no;
	this.age=age;
	
}
 
@Override
public String toString() {
	return "Employee [name=" + name + ", no=" + no + ", age=" + age + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 
}
