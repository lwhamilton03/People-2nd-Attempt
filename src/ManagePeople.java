import java.util.ArrayList;

	public class ManagePeople {
		
		ArrayList <Person> arrayPerson = new ArrayList<Person>(); 
		
		Person p1 = new Person("Gill", 14, "Paper Round", true);
		Person p2 = new Person("Jack", 15, "Gardener", false); 
		Person p3 = new Person ("Joe", 21, "Unemployed", false); 
		Person p4 = new Person ("John", 89, "Retires", false);
		
		public void registerPerson()
		{
			p1.getString();
			p2.getString();
	
			 
	
	
			arrayPerson.add(p1);
			arrayPerson.add(p2);
			arrayPerson.add(p3);
			arrayPerson.add(p4);
	
			for (Person eachPerson: arrayPerson)
			{
				eachPerson.getString();
			}
		}
	
}
