
public class Person {

		//VARIABLES in Class
	private String name; 
	private int age; 
	private String jobTitle;
	private boolean gender; 
	
	//CONSTRUCTOR
	public Person(String name, int age, String jobTitle, boolean gender)
	{
		this.name = name; 
		this.age = age;
		this.jobTitle = jobTitle;
		this.gender = gender;
	}
	
	public String toString()
	{
		if (gender)
		{ 
			return ("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Gender= Female");
		}
		else 
		{
			return ("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Gender: = Male");
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getJob()
	{
		return jobTitle;
	}
	
	public String getGender()
	{
		if (gender)
		{
			return "Female";
		}
		else
		{
			return "Male";
		}
	}
	
	
	
}
