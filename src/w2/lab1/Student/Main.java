package w2.lab1.Student;

import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		list.add(new Student(1, "Saehee", 21));
		list.add(new Student(2, "Youjin", 22));
		list.add(new Student(3, "Sharon", 24));
		list.add(new Student(4, "Sunny",  23));
		list.add(new Student(5, "HeeChan", 23));
		list.add(new Student(6, "Youjung", 22));
		list.add(new Student(7, "Juli", 22));
		list.add(new Student(8, "Minky", 22));
		list.add(new Student(9, "Jiswon", 23));
		list.add(new Student(10, "Soo", 22));

		Collections.sort(list);
		

		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());	
		}

		
	}
}

