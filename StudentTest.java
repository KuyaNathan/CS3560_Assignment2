public class StudentTest extends Student
{
	public static void main(String[] args)
	{
		Student stud1 = new Student("John", "CS", 3.5);
		Student stud2 = new Student();
		stud2.setName("Mary Ann");
		stud2.setMajor("CE");
		stud2.setGpa(3.3);

		System.out.println("Student 1: " + stud1.toString());
		System.out.println("Student 2: " + stud2.toString());
	}
}