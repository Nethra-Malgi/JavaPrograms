package inheritance;

class Parent {
	String name;

	void getName(String name) {
		System.out.println("name of the person is:" + name);
	}
}

class Child1 extends Parent {
	void getValue(double sal) {
		System.out.println("the salary is:" + sal);
	}
}

class Child2 extends Parent {
	void getJob(String job) {
		System.out.println("the job is :" + job);
	}
}

public class Hierarchy_Inheritance {

	public static void main(String[] args) {

		// there is no relationship between child1 and child2
		// so created different objects for both clasess

		Child1 ch1 = new Child1();
		System.out.println(ch1.name="Ramya");
		ch1.getName("Nethra");
		ch1.getValue(123.34);

		Child2 ch2 = new Child2();
		ch2.getName("Nethra");
		ch2.getJob("Manager");

	}

}
