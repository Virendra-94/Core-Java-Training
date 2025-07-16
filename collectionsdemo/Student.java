package collectionsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 4:35:36 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

//Comparable Interface is used to sort user defined objects based on single field -age

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if(age==o.age)
			return 0;
		else if(age>o.age) //else if(age < o.age) //descending order
			return 1;
		else 
			return -1;
	}

}
