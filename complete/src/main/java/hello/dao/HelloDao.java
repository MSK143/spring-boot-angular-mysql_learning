package hello.dao;

import java.util.ArrayList;

public class HelloDao{
    static ArrayList<Student> list = new ArrayList<Student>();

    static{
        Student s1 = new Student();
        s1.city="Indore";
        s1.name="MSK";
        s1.roll=1;
        list.add(s1);
    }

	public int add(Student bean) {
		list.add(bean);
        return list.size();
	}

    public ArrayList<Student> get() {
        return list;
	}

}