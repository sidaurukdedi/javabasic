class Student {
	public void name_of_dog(String name) {
		System.out.println("My name is : " + name);
	}

	public void grade(double grade) {
		System.out.println("Your grade is : " + grade);
	}
	
	public static void className(String name){
		System.out.println(String.format("Class name is : %s", name));
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name_of_dog("Max");
		student1.grade(4.25);
		Student.className("student1");
		
		Student student2 = new Student();
		student2.name_of_dog("John");
		student2.grade(3.25);
		Student.className("student2");
		
		Student student3 = new Student();
		student3.name_of_dog("Staccy");
		student3.grade(2.25);
		Student.className("student3");
	}

}
