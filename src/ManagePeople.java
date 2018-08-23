import java.util.ArrayList;

	public class ManagePeople {
		
		ArrayList <Person> arrayPerson = new ArrayList<Person>(); 
		
		Person p1 = new Person("Gill", 14, "Paper Round", true);
		Person p2 = new Person("Jack", 15, "Gardener", false); 
		Person p3 = new Person ("Joe", 21, "Unemployed", false); 
		Person p4 = new Person ("John", 89, "Retires", false);
		
		public void initialPeople()
		{
			arrayPerson.add(p1);
			arrayPerson.add(p2);
			arrayPerson.add(p3);
			arrayPerson.add(p4);
		}
		
		
		public void registerPerson(String name, int age, String jobTitle, boolean gender)
		{
			arrayPerson.add(new Person(name, age, jobTitle, gender));
		}
		
		public void printPeople()
		{
			for (Person eachPerson : arrayPerson)
			{
				System.out.println(eachPerson);
			}
		}
		
		public String searchName(String type)
		{
			for(Person eachPerson : arrayPerson)
			{
				if(eachPerson.getName() == type)
				{
					return eachPerson.toString(); 
				}
			}
			return "There is nobody called " + type;
		}
		
		public String searchAge(int num)
		{
			for (Person eachPerson : arrayPerson)
			{
				if(eachPerson.getAge() == num)
				{
					return eachPerson.toString();
				}
			}
			return "There is nobody called " + num;  
		}
		
	
}
