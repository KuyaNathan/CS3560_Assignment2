public class Student
{
	private String name;
	private String major;
	private double gpa;

	public Student()
	{
		name = "";
		major = "";
		gpa = 0.0;
	}
	public Student(String n, String m)
	{
		name = n;
		major = m;
		gpa = 0.0;
	}
	public Student(String n, String m, double g)
	{
		name = n;
		major = m;
		gpa = g;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}

	public String getMajor()
	{
		return major;
	}
	public void setMajor(String newMajor)
	{
		major = newMajor;
	}

	public double getGpa()
	{
		return gpa;
	}
	public void setGpa(double newGpa)
	{
		gpa = newGpa;
	}

	public String toString()
	{
		return ("Name: " + name + "\tMajor: " + major + "\tGPA: " + gpa);
	}

	public boolean equals(Student student)
	{
		if((this.name).equals(student.name) && (this.major).equals(student.major))
		{
			return true;
		}
		return false;
	}
}